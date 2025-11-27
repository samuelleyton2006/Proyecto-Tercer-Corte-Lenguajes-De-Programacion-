"""
LibreriaGraficas.py
Gráficas ASCII simples con guardado automático y compatibilidad Windows/Linux
 - guardar_puntos(path, xs, ys)
 - print_hist(vals, bins)
 - graficar_puntos_ascii(xs, ys, width, height, title, archivo)
 - graficar_linea_ascii(vals, width, height, title, archivo)
 - guardar_grafica_ascii(contenido, archivo)
"""

import sys
import platform
from Librerias.LibreriaArchivoGestion import escribir_txt

# Detectar sistema operativo para usar caracteres apropiados
IS_WINDOWS = platform.system() == 'Windows'

# Caracteres seguros para cada sistema
if IS_WINDOWS:
    CHAR_POINT = '*'
    CHAR_LINE = '*'
    CHAR_HIST = '#'
else:
    CHAR_POINT = '◆'
    CHAR_LINE = '◆'
    CHAR_HIST = '█'

 
def guardar_puntos(path, xs, ys):
    """Guarda puntos X,Y en formato CSV"""
    lines = []
    n = min(len(xs), len(ys))
    for i in range(n):
        lines.append(f"{xs[i]},{ys[i]}")
    escribir_txt(path, "\n".join(lines))
    return True


def guardar_grafica_ascii(contenido, archivo):
    """
    Guarda el contenido de una gráfica ASCII en un archivo
    
    Args:
        contenido: String con el contenido de la gráfica
        archivo: Ruta del archivo donde guardar
    """
    try:
        # En Windows, usar encoding utf-8 explícitamente
        with open(archivo, 'w', encoding='utf-8') as f:
            f.write(contenido)
        print(f"✓ Gráfica guardada en: {archivo}")
        return True
    except Exception as e:
        print(f"✗ Error al guardar gráfica: {e}")
        return False


def graficar_puntos_ascii(xs, ys, width=60, height=20, title=None, archivo=None, conectar=True):
    """
    Crea un gráfico ASCII de puntos X,Y con líneas conectadas
    
    Args:
        xs: Lista de valores X
        ys: Lista de valores Y
        width: Ancho de la gráfica
        height: Altura de la gráfica
        title: Título opcional
        archivo: Si se proporciona, guarda la gráfica en este archivo
        conectar: Si True, conecta los puntos con líneas (default: True)
        
    Returns:
        String con la gráfica ASCII
    """
    if not xs or not ys:
        return "(sin datos)"
    
    if len(xs) != len(ys):
        raise ValueError("xs e ys deben tener la misma longitud")
    
    # Encontrar rangos
    min_x, max_x = min(xs), max(xs)
    min_y, max_y = min(ys), max(ys)
    
    # Evitar división por cero
    if max_x == min_x:
        max_x = min_x + 1
    if max_y == min_y:
        max_y = min_y + 1
    
    # Crear grid
    grid = [[' ' for _ in range(width)] for _ in range(height)]
    
    # Función auxiliar para mapear coordenadas al grid
    def map_to_grid(x, y):
        col = int((x - min_x) / (max_x - min_x) * (width - 1))
        row = height - 1 - int((y - min_y) / (max_y - min_y) * (height - 1))
        col = max(0, min(width - 1, col))
        row = max(0, min(height - 1, row))
        return col, row
    
    # Si conectar está activado, dibujar líneas entre puntos consecutivos
    if conectar:
        for i in range(len(xs) - 1):
            x1, y1 = xs[i], ys[i]
            x2, y2 = xs[i + 1], ys[i + 1]
            
            col1, row1 = map_to_grid(x1, y1)
            col2, row2 = map_to_grid(x2, y2)
            
            # Dibujar línea usando algoritmo de Bresenham simplificado
            # Interpolación entre puntos
            steps = max(abs(col2 - col1), abs(row2 - row1)) + 1
            
            for step in range(steps + 1):
                t = step / max(steps, 1)
                col = int(col1 + t * (col2 - col1))
                row = int(row1 + t * (row2 - row1))
                
                if 0 <= row < height and 0 <= col < width:
                    # Usar carácter de línea si la celda está vacía
                    if grid[row][col] == ' ':
                        grid[row][col] = '-' if abs(row2 - row1) < abs(col2 - col1) else '|'
    
    # Dibujar puntos (sobrescriben las líneas para mejor visibilidad)
    for x, y in zip(xs, ys):
        col, row = map_to_grid(x, y)
        grid[row][col] = CHAR_POINT
    
    # Construir salida
    lines = []
    
    if title:
        lines.append(f"\n{title}")
        lines.append("=" * len(title))
    
    lines.append("+" + "-" * width + "+")
    for row in grid:
        lines.append("|" + "".join(row) + "|")
    lines.append("+" + "-" * width + "+")
    lines.append(f"X: [{min_x:.2f}, {max_x:.2f}]  Y: [{min_y:.2f}, {max_y:.2f}]")
    
    output = "\n".join(lines)
    
    # Mostrar en consola con encoding correcto
    try:
        print(output)
    except UnicodeEncodeError:
        # Fallback: reemplazar caracteres problemáticos
        safe_output = output.replace('◆', '*').replace('█', '#')
        print(safe_output)
    
    # Guardar en archivo si se especifica
    if archivo:
        guardar_grafica_ascii(output, archivo)
    
    return output


def graficar_linea_ascii(vals, width=60, height=15, title=None, archivo=None):
    """
    Crea un gráfico de línea ASCII
    
    Args:
        vals: Lista de valores Y (X será automático 0,1,2,...)
        width: Ancho de la gráfica
        height: Altura de la gráfica
        title: Título opcional
        archivo: Si se proporciona, guarda la gráfica en este archivo
        
    Returns:
        String con la gráfica ASCII
    """
    if not vals:
        return "(sin datos)"
    
    min_v, max_v = min(vals), max(vals)
    
    if max_v == min_v:
        max_v = min_v + 1
    
    # Crear grid
    grid = [[' ' for _ in range(width)] for _ in range(height)]
    
    # Mapear valores
    n = len(vals)
    for i, v in enumerate(vals):
        col = int(i / max(1, n - 1) * (width - 1)) if n > 1 else 0
        row = height - 1 - int((v - min_v) / (max_v - min_v) * (height - 1))
        if 0 <= row < height and 0 <= col < width:
            grid[row][col] = CHAR_LINE
    
    # Construir salida
    lines = []
    
    if title:
        lines.append(f"\n{title}")
        lines.append("=" * len(title))
    
    lines.append(f"Max: {max_v:.4f}")
    lines.append("+" + "-" * width + "+")
    for row in grid:
        lines.append("|" + "".join(row) + "|")
    lines.append("+" + "-" * width + "+")
    lines.append(f"Min: {min_v:.4f}")
    lines.append(f"Puntos: {len(vals)}")
    
    output = "\n".join(lines)
    
    # Mostrar en consola con encoding correcto
    try:
        print(output)
    except UnicodeEncodeError:
        # Fallback: reemplazar caracteres problemáticos
        safe_output = output.replace('◆', '*').replace('█', '#')
        print(safe_output)
    
    # Guardar en archivo si se especifica
    if archivo:
        guardar_grafica_ascii(output, archivo)
    
    return output


def print_hist(vals, bins=10, archivo=None):
    """
    Imprime un histograma ASCII
    
    Args:
        vals: Lista de valores
        bins: Número de bins
        archivo: Si se proporciona, guarda el histograma en este archivo
    """
    if not vals:
        output = "(sin datos)"
        print(output)
        return
    
    mn = min(vals)
    mx = max(vals)
    if mx == mn:
        mx = mn + 1
    
    width = 50
    counts = [0] * bins
    
    for v in vals:
        idx = int((v - mn) / (mx - mn) * bins)
        if idx == bins:
            idx = bins - 1
        counts[idx] += 1
    
    lines = []
    lines.append("\nHistograma:")
    lines.append("-" * 60)
    
    for i, c in enumerate(counts):
        bar = CHAR_HIST * int(c / max(1, max(counts)) * width)
        lines.append(f"{i:02d}: {bar} ({c})")
    
    output = "\n".join(lines)
    
    # Mostrar en consola con encoding correcto
    try:
        print(output)
    except UnicodeEncodeError:
        # Fallback: reemplazar caracteres problemáticos
        safe_output = output.replace('◆', '*').replace('█', '#')
        print(safe_output)
    
    # Guardar en archivo si se especifica
    if archivo:
        guardar_grafica_ascii(output, archivo)
    
    return counts