# Generated from Visitor/LenguajeDominioEspecifico.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,98,679,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,1,0,5,0,76,8,0,10,0,12,0,79,9,
        0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,3,1,100,8,1,1,2,1,2,1,2,1,2,1,2,1,2,5,2,108,8,2,10,
        2,12,2,111,9,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,120,8,2,10,2,12,2,
        123,9,2,1,2,1,2,5,2,127,8,2,10,2,12,2,130,9,2,1,2,1,2,1,2,5,2,135,
        8,2,10,2,12,2,138,9,2,1,2,3,2,141,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,156,8,3,10,3,12,3,159,9,3,1,3,1,3,
        1,4,1,4,1,4,1,4,1,4,1,4,5,4,169,8,4,10,4,12,4,172,9,4,1,4,1,4,1,
        5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,221,8,7,1,
        7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,5,7,235,8,7,10,7,12,
        7,238,9,7,1,8,1,8,1,8,1,8,5,8,244,8,8,10,8,12,8,247,9,8,1,8,1,8,
        1,8,1,8,1,8,1,8,5,8,255,8,8,10,8,12,8,258,9,8,1,8,1,8,3,8,262,8,
        8,1,9,1,9,1,9,1,9,5,9,268,8,9,10,9,12,9,271,9,9,1,9,1,9,1,10,1,10,
        1,10,1,10,5,10,279,8,10,10,10,12,10,282,9,10,3,10,284,8,10,1,10,
        1,10,1,11,1,11,1,11,5,11,291,8,11,10,11,12,11,294,9,11,1,12,1,12,
        1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,
        1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,3,12,319,8,12,1,12,1,12,
        3,12,323,8,12,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,
        1,14,1,14,1,14,5,14,338,8,14,10,14,12,14,341,9,14,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,3,15,367,8,15,1,16,1,16,
        1,16,1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,17,1,17,1,17,1,17,1,17,
        1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,1,18,1,18,1,18,3,18,402,8,18,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,3,18,424,8,18,1,18,1,18,3,18,428,8,18,1,19,1,19,1,19,5,
        19,433,8,19,10,19,12,19,436,9,19,1,20,1,20,1,20,1,20,1,20,1,20,1,
        20,1,20,1,20,3,20,447,8,20,1,21,1,21,1,21,5,21,452,8,21,10,21,12,
        21,455,9,21,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,3,22,466,
        8,22,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,
        1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,3,23,489,8,23,1,23,
        1,23,3,23,493,8,23,1,24,1,24,1,24,5,24,498,8,24,10,24,12,24,501,
        9,24,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,3,25,512,8,25,
        1,26,1,26,1,26,5,26,517,8,26,10,26,12,26,520,9,26,1,27,1,27,1,27,
        1,27,1,27,1,27,1,27,1,27,1,27,3,27,531,8,27,1,28,1,28,1,28,1,28,
        1,28,1,28,1,28,3,28,540,8,28,1,28,1,28,1,28,1,29,1,29,1,29,5,29,
        548,8,29,10,29,12,29,551,9,29,1,30,1,30,1,30,1,30,1,30,1,30,1,30,
        1,30,1,30,1,30,1,30,1,30,3,30,565,8,30,1,31,1,31,1,31,1,31,1,31,
        5,31,572,8,31,10,31,12,31,575,9,31,1,31,1,31,1,31,1,32,1,32,1,32,
        1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,
        1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,
        1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,
        1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,
        3,32,635,8,32,1,33,1,33,1,33,1,33,1,34,1,34,1,34,1,34,1,34,3,34,
        646,8,34,1,34,1,34,1,34,1,35,1,35,1,35,5,35,654,8,35,10,35,12,35,
        657,9,35,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,
        1,36,1,36,1,36,1,36,1,36,1,36,1,36,3,36,677,8,36,1,36,0,1,14,37,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
        46,48,50,52,54,56,58,60,62,64,66,68,70,72,0,7,1,0,23,28,1,0,8,10,
        1,0,11,16,1,0,17,18,1,0,19,20,1,0,35,38,1,0,87,88,742,0,77,1,0,0,
        0,2,99,1,0,0,0,4,101,1,0,0,0,6,142,1,0,0,0,8,162,1,0,0,0,10,175,
        1,0,0,0,12,177,1,0,0,0,14,220,1,0,0,0,16,261,1,0,0,0,18,263,1,0,
        0,0,20,274,1,0,0,0,22,287,1,0,0,0,24,322,1,0,0,0,26,324,1,0,0,0,
        28,334,1,0,0,0,30,366,1,0,0,0,32,368,1,0,0,0,34,376,1,0,0,0,36,427,
        1,0,0,0,38,429,1,0,0,0,40,446,1,0,0,0,42,448,1,0,0,0,44,465,1,0,
        0,0,46,492,1,0,0,0,48,494,1,0,0,0,50,511,1,0,0,0,52,513,1,0,0,0,
        54,530,1,0,0,0,56,532,1,0,0,0,58,544,1,0,0,0,60,564,1,0,0,0,62,566,
        1,0,0,0,64,634,1,0,0,0,66,636,1,0,0,0,68,640,1,0,0,0,70,650,1,0,
        0,0,72,676,1,0,0,0,74,76,3,2,1,0,75,74,1,0,0,0,76,79,1,0,0,0,77,
        75,1,0,0,0,77,78,1,0,0,0,78,80,1,0,0,0,79,77,1,0,0,0,80,81,5,0,0,
        1,81,1,1,0,0,0,82,100,3,12,6,0,83,100,3,24,12,0,84,100,3,36,18,0,
        85,100,3,26,13,0,86,100,3,62,31,0,87,100,3,10,5,0,88,100,3,6,3,0,
        89,100,3,8,4,0,90,100,3,4,2,0,91,100,3,68,34,0,92,93,3,64,32,0,93,
        94,5,1,0,0,94,100,1,0,0,0,95,100,3,46,23,0,96,100,3,56,28,0,97,100,
        3,32,16,0,98,100,3,34,17,0,99,82,1,0,0,0,99,83,1,0,0,0,99,84,1,0,
        0,0,99,85,1,0,0,0,99,86,1,0,0,0,99,87,1,0,0,0,99,88,1,0,0,0,99,89,
        1,0,0,0,99,90,1,0,0,0,99,91,1,0,0,0,99,92,1,0,0,0,99,95,1,0,0,0,
        99,96,1,0,0,0,99,97,1,0,0,0,99,98,1,0,0,0,100,3,1,0,0,0,101,102,
        5,81,0,0,102,103,5,2,0,0,103,104,3,14,7,0,104,105,5,3,0,0,105,109,
        5,4,0,0,106,108,3,2,1,0,107,106,1,0,0,0,108,111,1,0,0,0,109,107,
        1,0,0,0,109,110,1,0,0,0,110,112,1,0,0,0,111,109,1,0,0,0,112,128,
        5,5,0,0,113,114,5,82,0,0,114,115,5,2,0,0,115,116,3,14,7,0,116,117,
        5,3,0,0,117,121,5,4,0,0,118,120,3,2,1,0,119,118,1,0,0,0,120,123,
        1,0,0,0,121,119,1,0,0,0,121,122,1,0,0,0,122,124,1,0,0,0,123,121,
        1,0,0,0,124,125,5,5,0,0,125,127,1,0,0,0,126,113,1,0,0,0,127,130,
        1,0,0,0,128,126,1,0,0,0,128,129,1,0,0,0,129,140,1,0,0,0,130,128,
        1,0,0,0,131,132,5,83,0,0,132,136,5,4,0,0,133,135,3,2,1,0,134,133,
        1,0,0,0,135,138,1,0,0,0,136,134,1,0,0,0,136,137,1,0,0,0,137,139,
        1,0,0,0,138,136,1,0,0,0,139,141,5,5,0,0,140,131,1,0,0,0,140,141,
        1,0,0,0,141,5,1,0,0,0,142,143,5,79,0,0,143,144,5,2,0,0,144,145,5,
        94,0,0,145,146,5,84,0,0,146,147,5,85,0,0,147,148,5,2,0,0,148,149,
        3,14,7,0,149,150,5,6,0,0,150,151,3,14,7,0,151,152,5,3,0,0,152,153,
        5,3,0,0,153,157,5,4,0,0,154,156,3,2,1,0,155,154,1,0,0,0,156,159,
        1,0,0,0,157,155,1,0,0,0,157,158,1,0,0,0,158,160,1,0,0,0,159,157,
        1,0,0,0,160,161,5,5,0,0,161,7,1,0,0,0,162,163,5,80,0,0,163,164,5,
        2,0,0,164,165,3,14,7,0,165,166,5,3,0,0,166,170,5,4,0,0,167,169,3,
        2,1,0,168,167,1,0,0,0,169,172,1,0,0,0,170,168,1,0,0,0,170,171,1,
        0,0,0,171,173,1,0,0,0,172,170,1,0,0,0,173,174,5,5,0,0,174,9,1,0,
        0,0,175,176,5,97,0,0,176,11,1,0,0,0,177,178,5,94,0,0,178,179,5,7,
        0,0,179,180,3,14,7,0,180,181,5,1,0,0,181,13,1,0,0,0,182,183,6,7,
        -1,0,183,184,5,21,0,0,184,221,3,14,7,15,185,186,5,2,0,0,186,187,
        3,14,7,0,187,188,5,3,0,0,188,221,1,0,0,0,189,190,5,78,0,0,190,191,
        5,22,0,0,191,192,7,0,0,0,192,193,5,2,0,0,193,194,3,22,11,0,194,195,
        5,3,0,0,195,221,1,0,0,0,196,197,5,94,0,0,197,198,5,22,0,0,198,221,
        5,29,0,0,199,200,5,93,0,0,200,201,5,2,0,0,201,221,5,3,0,0,202,221,
        3,64,32,0,203,221,3,16,8,0,204,221,3,20,10,0,205,221,5,95,0,0,206,
        221,5,94,0,0,207,221,5,96,0,0,208,221,5,87,0,0,209,221,5,88,0,0,
        210,211,5,30,0,0,211,212,5,2,0,0,212,213,3,14,7,0,213,214,5,3,0,
        0,214,221,1,0,0,0,215,216,5,31,0,0,216,217,5,2,0,0,217,218,3,14,
        7,0,218,219,5,3,0,0,219,221,1,0,0,0,220,182,1,0,0,0,220,185,1,0,
        0,0,220,189,1,0,0,0,220,196,1,0,0,0,220,199,1,0,0,0,220,202,1,0,
        0,0,220,203,1,0,0,0,220,204,1,0,0,0,220,205,1,0,0,0,220,206,1,0,
        0,0,220,207,1,0,0,0,220,208,1,0,0,0,220,209,1,0,0,0,220,210,1,0,
        0,0,220,215,1,0,0,0,221,236,1,0,0,0,222,223,10,19,0,0,223,224,7,
        1,0,0,224,235,3,14,7,20,225,226,10,18,0,0,226,227,7,2,0,0,227,235,
        3,14,7,19,228,229,10,17,0,0,229,230,7,3,0,0,230,235,3,14,7,18,231,
        232,10,16,0,0,232,233,7,4,0,0,233,235,3,14,7,17,234,222,1,0,0,0,
        234,225,1,0,0,0,234,228,1,0,0,0,234,231,1,0,0,0,235,238,1,0,0,0,
        236,234,1,0,0,0,236,237,1,0,0,0,237,15,1,0,0,0,238,236,1,0,0,0,239,
        240,5,32,0,0,240,245,3,18,9,0,241,242,5,6,0,0,242,244,3,18,9,0,243,
        241,1,0,0,0,244,247,1,0,0,0,245,243,1,0,0,0,245,246,1,0,0,0,246,
        248,1,0,0,0,247,245,1,0,0,0,248,249,5,33,0,0,249,262,1,0,0,0,250,
        251,5,32,0,0,251,256,3,14,7,0,252,253,5,6,0,0,253,255,3,14,7,0,254,
        252,1,0,0,0,255,258,1,0,0,0,256,254,1,0,0,0,256,257,1,0,0,0,257,
        259,1,0,0,0,258,256,1,0,0,0,259,260,5,33,0,0,260,262,1,0,0,0,261,
        239,1,0,0,0,261,250,1,0,0,0,262,17,1,0,0,0,263,264,5,32,0,0,264,
        269,3,14,7,0,265,266,5,6,0,0,266,268,3,14,7,0,267,265,1,0,0,0,268,
        271,1,0,0,0,269,267,1,0,0,0,269,270,1,0,0,0,270,272,1,0,0,0,271,
        269,1,0,0,0,272,273,5,33,0,0,273,19,1,0,0,0,274,283,5,32,0,0,275,
        280,3,14,7,0,276,277,5,6,0,0,277,279,3,14,7,0,278,276,1,0,0,0,279,
        282,1,0,0,0,280,278,1,0,0,0,280,281,1,0,0,0,281,284,1,0,0,0,282,
        280,1,0,0,0,283,275,1,0,0,0,283,284,1,0,0,0,284,285,1,0,0,0,285,
        286,5,33,0,0,286,21,1,0,0,0,287,292,3,14,7,0,288,289,5,6,0,0,289,
        291,3,14,7,0,290,288,1,0,0,0,291,294,1,0,0,0,292,290,1,0,0,0,292,
        293,1,0,0,0,293,23,1,0,0,0,294,292,1,0,0,0,295,296,5,94,0,0,296,
        297,5,22,0,0,297,298,5,34,0,0,298,299,5,2,0,0,299,300,3,14,7,0,300,
        301,5,6,0,0,301,302,3,14,7,0,302,303,5,3,0,0,303,304,5,1,0,0,304,
        323,1,0,0,0,305,306,5,94,0,0,306,307,5,7,0,0,307,308,5,94,0,0,308,
        309,5,22,0,0,309,310,7,5,0,0,310,311,5,2,0,0,311,312,5,3,0,0,312,
        323,5,1,0,0,313,314,5,94,0,0,314,315,5,22,0,0,315,316,5,39,0,0,316,
        318,5,2,0,0,317,319,3,28,14,0,318,317,1,0,0,0,318,319,1,0,0,0,319,
        320,1,0,0,0,320,321,5,3,0,0,321,323,5,1,0,0,322,295,1,0,0,0,322,
        305,1,0,0,0,322,313,1,0,0,0,323,25,1,0,0,0,324,325,5,94,0,0,325,
        326,5,7,0,0,326,327,5,94,0,0,327,328,5,22,0,0,328,329,5,40,0,0,329,
        330,5,2,0,0,330,331,3,14,7,0,331,332,5,3,0,0,332,333,5,1,0,0,333,
        27,1,0,0,0,334,339,3,30,15,0,335,336,5,6,0,0,336,338,3,30,15,0,337,
        335,1,0,0,0,338,341,1,0,0,0,339,337,1,0,0,0,339,340,1,0,0,0,340,
        29,1,0,0,0,341,339,1,0,0,0,342,343,5,41,0,0,343,344,5,7,0,0,344,
        367,5,95,0,0,345,346,5,42,0,0,346,347,5,7,0,0,347,367,5,95,0,0,348,
        349,5,43,0,0,349,350,5,7,0,0,350,367,5,95,0,0,351,352,5,44,0,0,352,
        353,5,7,0,0,353,367,5,96,0,0,354,355,5,45,0,0,355,356,5,7,0,0,356,
        367,5,96,0,0,357,358,5,46,0,0,358,359,5,7,0,0,359,367,5,96,0,0,360,
        361,5,47,0,0,361,362,5,7,0,0,362,367,7,6,0,0,363,364,5,48,0,0,364,
        365,5,7,0,0,365,367,5,96,0,0,366,342,1,0,0,0,366,345,1,0,0,0,366,
        348,1,0,0,0,366,351,1,0,0,0,366,354,1,0,0,0,366,357,1,0,0,0,366,
        360,1,0,0,0,366,363,1,0,0,0,367,31,1,0,0,0,368,369,5,49,0,0,369,
        370,5,2,0,0,370,371,3,14,7,0,371,372,5,6,0,0,372,373,3,14,7,0,373,
        374,5,3,0,0,374,375,5,1,0,0,375,33,1,0,0,0,376,377,5,50,0,0,377,
        378,5,2,0,0,378,379,3,14,7,0,379,380,5,6,0,0,380,381,3,14,7,0,381,
        382,5,3,0,0,382,383,5,1,0,0,383,35,1,0,0,0,384,385,5,94,0,0,385,
        386,5,7,0,0,386,387,5,92,0,0,387,388,5,2,0,0,388,389,3,38,19,0,389,
        390,5,3,0,0,390,391,5,1,0,0,391,428,1,0,0,0,392,393,5,94,0,0,393,
        394,5,22,0,0,394,395,5,34,0,0,395,396,5,2,0,0,396,397,3,14,7,0,397,
        398,5,6,0,0,398,401,3,14,7,0,399,400,5,6,0,0,400,402,3,42,21,0,401,
        399,1,0,0,0,401,402,1,0,0,0,402,403,1,0,0,0,403,404,5,3,0,0,404,
        405,5,1,0,0,405,428,1,0,0,0,406,407,5,94,0,0,407,408,5,7,0,0,408,
        409,5,94,0,0,409,410,5,22,0,0,410,411,5,51,0,0,411,412,5,2,0,0,412,
        413,3,14,7,0,413,414,5,6,0,0,414,415,3,14,7,0,415,416,5,3,0,0,416,
        417,5,1,0,0,417,428,1,0,0,0,418,419,5,94,0,0,419,420,5,22,0,0,420,
        421,5,52,0,0,421,423,5,2,0,0,422,424,5,96,0,0,423,422,1,0,0,0,423,
        424,1,0,0,0,424,425,1,0,0,0,425,426,5,3,0,0,426,428,5,1,0,0,427,
        384,1,0,0,0,427,392,1,0,0,0,427,406,1,0,0,0,427,418,1,0,0,0,428,
        37,1,0,0,0,429,434,3,40,20,0,430,431,5,6,0,0,431,433,3,40,20,0,432,
        430,1,0,0,0,433,436,1,0,0,0,434,432,1,0,0,0,434,435,1,0,0,0,435,
        39,1,0,0,0,436,434,1,0,0,0,437,438,5,53,0,0,438,439,5,7,0,0,439,
        447,3,20,10,0,440,441,5,54,0,0,441,442,5,7,0,0,442,447,5,95,0,0,
        443,444,5,55,0,0,444,445,5,7,0,0,445,447,5,95,0,0,446,437,1,0,0,
        0,446,440,1,0,0,0,446,443,1,0,0,0,447,41,1,0,0,0,448,453,3,44,22,
        0,449,450,5,6,0,0,450,452,3,44,22,0,451,449,1,0,0,0,452,455,1,0,
        0,0,453,451,1,0,0,0,453,454,1,0,0,0,454,43,1,0,0,0,455,453,1,0,0,
        0,456,457,5,56,0,0,457,458,5,7,0,0,458,466,5,95,0,0,459,460,5,57,
        0,0,460,461,5,7,0,0,461,466,5,95,0,0,462,463,5,58,0,0,463,464,5,
        7,0,0,464,466,7,6,0,0,465,456,1,0,0,0,465,459,1,0,0,0,465,462,1,
        0,0,0,466,45,1,0,0,0,467,468,5,94,0,0,468,469,5,7,0,0,469,470,5,
        91,0,0,470,471,5,2,0,0,471,472,3,48,24,0,472,473,5,3,0,0,473,474,
        5,1,0,0,474,493,1,0,0,0,475,476,5,94,0,0,476,477,5,22,0,0,477,478,
        5,34,0,0,478,479,5,2,0,0,479,480,3,14,7,0,480,481,5,3,0,0,481,482,
        5,1,0,0,482,493,1,0,0,0,483,484,5,94,0,0,484,485,5,22,0,0,485,486,
        5,39,0,0,486,488,5,2,0,0,487,489,3,52,26,0,488,487,1,0,0,0,488,489,
        1,0,0,0,489,490,1,0,0,0,490,491,5,3,0,0,491,493,5,1,0,0,492,467,
        1,0,0,0,492,475,1,0,0,0,492,483,1,0,0,0,493,47,1,0,0,0,494,499,3,
        50,25,0,495,496,5,6,0,0,496,498,3,50,25,0,497,495,1,0,0,0,498,501,
        1,0,0,0,499,497,1,0,0,0,499,500,1,0,0,0,500,49,1,0,0,0,501,499,1,
        0,0,0,502,503,5,59,0,0,503,504,5,7,0,0,504,512,5,95,0,0,505,506,
        5,60,0,0,506,507,5,7,0,0,507,512,5,95,0,0,508,509,5,55,0,0,509,510,
        5,7,0,0,510,512,5,95,0,0,511,502,1,0,0,0,511,505,1,0,0,0,511,508,
        1,0,0,0,512,51,1,0,0,0,513,518,3,54,27,0,514,515,5,6,0,0,515,517,
        3,54,27,0,516,514,1,0,0,0,517,520,1,0,0,0,518,516,1,0,0,0,518,519,
        1,0,0,0,519,53,1,0,0,0,520,518,1,0,0,0,521,522,5,41,0,0,522,523,
        5,7,0,0,523,531,5,95,0,0,524,525,5,42,0,0,525,526,5,7,0,0,526,531,
        5,95,0,0,527,528,5,48,0,0,528,529,5,7,0,0,529,531,5,96,0,0,530,521,
        1,0,0,0,530,524,1,0,0,0,530,527,1,0,0,0,531,55,1,0,0,0,532,533,5,
        89,0,0,533,534,5,2,0,0,534,535,3,14,7,0,535,536,5,6,0,0,536,539,
        3,14,7,0,537,538,5,6,0,0,538,540,3,58,29,0,539,537,1,0,0,0,539,540,
        1,0,0,0,540,541,1,0,0,0,541,542,5,3,0,0,542,543,5,1,0,0,543,57,1,
        0,0,0,544,549,3,60,30,0,545,546,5,6,0,0,546,548,3,60,30,0,547,545,
        1,0,0,0,548,551,1,0,0,0,549,547,1,0,0,0,549,550,1,0,0,0,550,59,1,
        0,0,0,551,549,1,0,0,0,552,553,5,41,0,0,553,554,5,7,0,0,554,565,5,
        95,0,0,555,556,5,42,0,0,556,557,5,7,0,0,557,565,5,95,0,0,558,559,
        5,46,0,0,559,560,5,7,0,0,560,565,5,96,0,0,561,562,5,48,0,0,562,563,
        5,7,0,0,563,565,5,96,0,0,564,552,1,0,0,0,564,555,1,0,0,0,564,558,
        1,0,0,0,564,561,1,0,0,0,565,61,1,0,0,0,566,567,5,86,0,0,567,568,
        5,2,0,0,568,573,3,14,7,0,569,570,5,6,0,0,570,572,3,14,7,0,571,569,
        1,0,0,0,572,575,1,0,0,0,573,571,1,0,0,0,573,574,1,0,0,0,574,576,
        1,0,0,0,575,573,1,0,0,0,576,577,5,3,0,0,577,578,5,1,0,0,578,63,1,
        0,0,0,579,580,5,61,0,0,580,581,5,2,0,0,581,582,3,14,7,0,582,583,
        5,3,0,0,583,635,1,0,0,0,584,585,5,62,0,0,585,586,5,2,0,0,586,587,
        3,14,7,0,587,588,5,3,0,0,588,635,1,0,0,0,589,590,5,63,0,0,590,591,
        5,2,0,0,591,592,3,14,7,0,592,593,5,3,0,0,593,635,1,0,0,0,594,595,
        5,64,0,0,595,596,5,2,0,0,596,597,3,14,7,0,597,598,5,3,0,0,598,635,
        1,0,0,0,599,600,5,65,0,0,600,601,5,2,0,0,601,602,3,14,7,0,602,603,
        5,3,0,0,603,635,1,0,0,0,604,605,5,66,0,0,605,606,5,2,0,0,606,607,
        3,66,33,0,607,608,5,3,0,0,608,635,1,0,0,0,609,610,5,67,0,0,610,611,
        5,2,0,0,611,612,3,14,7,0,612,613,5,3,0,0,613,635,1,0,0,0,614,615,
        5,68,0,0,615,616,5,2,0,0,616,617,3,14,7,0,617,618,5,3,0,0,618,635,
        1,0,0,0,619,620,5,69,0,0,620,621,5,2,0,0,621,622,3,14,7,0,622,623,
        5,3,0,0,623,635,1,0,0,0,624,625,5,70,0,0,625,626,5,2,0,0,626,627,
        3,66,33,0,627,628,5,3,0,0,628,635,1,0,0,0,629,630,5,71,0,0,630,631,
        5,2,0,0,631,632,3,66,33,0,632,633,5,3,0,0,633,635,1,0,0,0,634,579,
        1,0,0,0,634,584,1,0,0,0,634,589,1,0,0,0,634,594,1,0,0,0,634,599,
        1,0,0,0,634,604,1,0,0,0,634,609,1,0,0,0,634,614,1,0,0,0,634,619,
        1,0,0,0,634,624,1,0,0,0,634,629,1,0,0,0,635,65,1,0,0,0,636,637,3,
        14,7,0,637,638,5,6,0,0,638,639,3,14,7,0,639,67,1,0,0,0,640,641,5,
        90,0,0,641,642,5,2,0,0,642,645,3,14,7,0,643,644,5,6,0,0,644,646,
        3,70,35,0,645,643,1,0,0,0,645,646,1,0,0,0,646,647,1,0,0,0,647,648,
        5,3,0,0,648,649,5,1,0,0,649,69,1,0,0,0,650,655,3,72,36,0,651,652,
        5,6,0,0,652,654,3,72,36,0,653,651,1,0,0,0,654,657,1,0,0,0,655,653,
        1,0,0,0,655,656,1,0,0,0,656,71,1,0,0,0,657,655,1,0,0,0,658,659,5,
        72,0,0,659,660,5,7,0,0,660,677,5,95,0,0,661,662,5,73,0,0,662,663,
        5,7,0,0,663,677,5,95,0,0,664,665,5,74,0,0,665,666,5,7,0,0,666,677,
        5,95,0,0,667,668,5,75,0,0,668,669,5,7,0,0,669,677,5,96,0,0,670,671,
        5,76,0,0,671,672,5,7,0,0,672,677,7,6,0,0,673,674,5,77,0,0,674,675,
        5,7,0,0,675,677,3,20,10,0,676,658,1,0,0,0,676,661,1,0,0,0,676,664,
        1,0,0,0,676,667,1,0,0,0,676,670,1,0,0,0,676,673,1,0,0,0,677,73,1,
        0,0,0,44,77,99,109,121,128,136,140,157,170,220,234,236,245,256,261,
        269,280,283,292,318,322,339,366,401,423,427,434,446,453,465,488,
        492,499,511,518,530,539,549,564,573,634,645,655,676
    ]

class LenguajeDominioEspecificoParser ( Parser ):

    grammarFileName = "LenguajeDominioEspecifico.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'('", "')'", "'{'", "'}'", "','", 
                     "'='", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", 
                     "'>'", "'<='", "'>='", "'+'", "'-'", "'and'", "'or'", 
                     "'not'", "'.'", "'suma'", "'resta'", "'multiplicar'", 
                     "'transpuesta'", "'determinante'", "'inversa'", "'centroids'", 
                     "'leer_archivo'", "'cargar_matriz'", "'['", "']'", 
                     "'fit'", "'mse'", "'mae'", "'r2'", "'rmse'", "'plot'", 
                     "'predict'", "'width'", "'height'", "'left_margin'", 
                     "'point_char'", "'line_char'", "'title'", "'show_stats'", 
                     "'output_file'", "'escribir_archivo'", "'guardar_matriz'", 
                     "'score'", "'plot_loss'", "'layers'", "'learning_rate'", 
                     "'seed'", "'epochs'", "'batch_size'", "'verbose'", 
                     "'n_clusters'", "'max_iter'", "'abs'", "'factorial'", 
                     "'exp'", "'ln'", "'sqrt'", "'powf'", "'sin'", "'cos'", 
                     "'tan'", "'div'", "'mod'", "'max_rows'", "'max_cols'", 
                     "'max_col_width'", "'floatfmt'", "'show_index'", "'headers'", 
                     "'matriz'", "'for'", "'while'", "'if'", "'elif'", "'else'", 
                     "'in'", "'range'", "'print'", "'True'", "'False'", 
                     "'graficar'", "'mostrar_tabla'", "'KMeans'", "'PerceptronMulticapa'", 
                     "'RegresionLineal'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "MATRIZ", "FOR", "WHILE", 
                      "IF", "ELIF", "ELSE", "IN", "RANGE", "PRINT", "TRUE", 
                      "FALSE", "GRAFICAR", "MOSTRAR_TABLA", "KMEANS", "PERCEPTRON", 
                      "REGRESION", "ID", "NUMBER", "STRING", "COMENTARIO", 
                      "WS" ]

    RULE_programa = 0
    RULE_instruccion = 1
    RULE_condicional = 2
    RULE_buclefor = 3
    RULE_buclewhile = 4
    RULE_comentario = 5
    RULE_asignacion = 6
    RULE_expresion = 7
    RULE_matriz = 8
    RULE_fila = 9
    RULE_lista = 10
    RULE_parametrosMatriz = 11
    RULE_regresionLineal = 12
    RULE_prediccionModelo = 13
    RULE_parametrosPlot = 14
    RULE_parametroPlot = 15
    RULE_escribirArchivo = 16
    RULE_guardarMatriz = 17
    RULE_perceptronMulticapa = 18
    RULE_parametrosMLP = 19
    RULE_parametroMLP = 20
    RULE_parametrosEntrenamiento = 21
    RULE_parametroEntrenamiento = 22
    RULE_kmeans = 23
    RULE_parametrosKMeans = 24
    RULE_parametroKMeans = 25
    RULE_parametrosGraficarKMeans = 26
    RULE_parametroGraficarKMeans = 27
    RULE_graficar = 28
    RULE_parametrosGraficar = 29
    RULE_parametroGraficar = 30
    RULE_impresion = 31
    RULE_operaciones = 32
    RULE_parametrosOp = 33
    RULE_mostrarTabla = 34
    RULE_parametrosTabla = 35
    RULE_parametroTabla = 36

    ruleNames =  [ "programa", "instruccion", "condicional", "buclefor", 
                   "buclewhile", "comentario", "asignacion", "expresion", 
                   "matriz", "fila", "lista", "parametrosMatriz", "regresionLineal", 
                   "prediccionModelo", "parametrosPlot", "parametroPlot", 
                   "escribirArchivo", "guardarMatriz", "perceptronMulticapa", 
                   "parametrosMLP", "parametroMLP", "parametrosEntrenamiento", 
                   "parametroEntrenamiento", "kmeans", "parametrosKMeans", 
                   "parametroKMeans", "parametrosGraficarKMeans", "parametroGraficarKMeans", 
                   "graficar", "parametrosGraficar", "parametroGraficar", 
                   "impresion", "operaciones", "parametrosOp", "mostrarTabla", 
                   "parametrosTabla", "parametroTabla" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    T__39=40
    T__40=41
    T__41=42
    T__42=43
    T__43=44
    T__44=45
    T__45=46
    T__46=47
    T__47=48
    T__48=49
    T__49=50
    T__50=51
    T__51=52
    T__52=53
    T__53=54
    T__54=55
    T__55=56
    T__56=57
    T__57=58
    T__58=59
    T__59=60
    T__60=61
    T__61=62
    T__62=63
    T__63=64
    T__64=65
    T__65=66
    T__66=67
    T__67=68
    T__68=69
    T__69=70
    T__70=71
    T__71=72
    T__72=73
    T__73=74
    T__74=75
    T__75=76
    T__76=77
    MATRIZ=78
    FOR=79
    WHILE=80
    IF=81
    ELIF=82
    ELSE=83
    IN=84
    RANGE=85
    PRINT=86
    TRUE=87
    FALSE=88
    GRAFICAR=89
    MOSTRAR_TABLA=90
    KMEANS=91
    PERCEPTRON=92
    REGRESION=93
    ID=94
    NUMBER=95
    STRING=96
    COMENTARIO=97
    WS=98

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(LenguajeDominioEspecificoParser.EOF, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.InstruccionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = LenguajeDominioEspecificoParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                self.state = 74
                self.instruccion()
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 80
            self.match(LenguajeDominioEspecificoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstruccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def asignacion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.AsignacionContext,0)


        def regresionLineal(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.RegresionLinealContext,0)


        def perceptronMulticapa(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.PerceptronMulticapaContext,0)


        def prediccionModelo(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.PrediccionModeloContext,0)


        def impresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ImpresionContext,0)


        def comentario(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ComentarioContext,0)


        def buclefor(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.BucleforContext,0)


        def buclewhile(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.BuclewhileContext,0)


        def condicional(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.CondicionalContext,0)


        def mostrarTabla(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.MostrarTablaContext,0)


        def operaciones(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.OperacionesContext,0)


        def kmeans(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.KmeansContext,0)


        def graficar(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.GraficarContext,0)


        def escribirArchivo(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.EscribirArchivoContext,0)


        def guardarMatriz(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.GuardarMatrizContext,0)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_instruccion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruccion" ):
                listener.enterInstruccion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruccion" ):
                listener.exitInstruccion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruccion" ):
                return visitor.visitInstruccion(self)
            else:
                return visitor.visitChildren(self)




    def instruccion(self):

        localctx = LenguajeDominioEspecificoParser.InstruccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_instruccion)
        try:
            self.state = 99
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 82
                self.asignacion()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 83
                self.regresionLineal()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 84
                self.perceptronMulticapa()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 85
                self.prediccionModelo()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 86
                self.impresion()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 87
                self.comentario()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 88
                self.buclefor()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 89
                self.buclewhile()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 90
                self.condicional()
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 91
                self.mostrarTabla()
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 92
                self.operaciones()
                self.state = 93
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 12:
                self.enterOuterAlt(localctx, 12)
                self.state = 95
                self.kmeans()
                pass

            elif la_ == 13:
                self.enterOuterAlt(localctx, 13)
                self.state = 96
                self.graficar()
                pass

            elif la_ == 14:
                self.enterOuterAlt(localctx, 14)
                self.state = 97
                self.escribirArchivo()
                pass

            elif la_ == 15:
                self.enterOuterAlt(localctx, 15)
                self.state = 98
                self.guardarMatriz()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(LenguajeDominioEspecificoParser.IF, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.InstruccionContext,i)


        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(LenguajeDominioEspecificoParser.ELIF)
            else:
                return self.getToken(LenguajeDominioEspecificoParser.ELIF, i)

        def ELSE(self):
            return self.getToken(LenguajeDominioEspecificoParser.ELSE, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_condicional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicional" ):
                listener.enterCondicional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicional" ):
                listener.exitCondicional(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondicional" ):
                return visitor.visitCondicional(self)
            else:
                return visitor.visitChildren(self)




    def condicional(self):

        localctx = LenguajeDominioEspecificoParser.CondicionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_condicional)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 101
            self.match(LenguajeDominioEspecificoParser.IF)
            self.state = 102
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 103
            self.expresion(0)
            self.state = 104
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 105
            self.match(LenguajeDominioEspecificoParser.T__3)
            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                self.state = 106
                self.instruccion()
                self.state = 111
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 112
            self.match(LenguajeDominioEspecificoParser.T__4)
            self.state = 128
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==82:
                self.state = 113
                self.match(LenguajeDominioEspecificoParser.ELIF)
                self.state = 114
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 115
                self.expresion(0)
                self.state = 116
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 117
                self.match(LenguajeDominioEspecificoParser.T__3)
                self.state = 121
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                    self.state = 118
                    self.instruccion()
                    self.state = 123
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 124
                self.match(LenguajeDominioEspecificoParser.T__4)
                self.state = 130
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==83:
                self.state = 131
                self.match(LenguajeDominioEspecificoParser.ELSE)
                self.state = 132
                self.match(LenguajeDominioEspecificoParser.T__3)
                self.state = 136
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                    self.state = 133
                    self.instruccion()
                    self.state = 138
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 139
                self.match(LenguajeDominioEspecificoParser.T__4)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BucleforContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(LenguajeDominioEspecificoParser.FOR, 0)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)

        def IN(self):
            return self.getToken(LenguajeDominioEspecificoParser.IN, 0)

        def RANGE(self):
            return self.getToken(LenguajeDominioEspecificoParser.RANGE, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.InstruccionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_buclefor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBuclefor" ):
                listener.enterBuclefor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBuclefor" ):
                listener.exitBuclefor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBuclefor" ):
                return visitor.visitBuclefor(self)
            else:
                return visitor.visitChildren(self)




    def buclefor(self):

        localctx = LenguajeDominioEspecificoParser.BucleforContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_buclefor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 142
            self.match(LenguajeDominioEspecificoParser.FOR)
            self.state = 143
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 144
            self.match(LenguajeDominioEspecificoParser.ID)
            self.state = 145
            self.match(LenguajeDominioEspecificoParser.IN)
            self.state = 146
            self.match(LenguajeDominioEspecificoParser.RANGE)
            self.state = 147
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 148
            self.expresion(0)
            self.state = 149
            self.match(LenguajeDominioEspecificoParser.T__5)
            self.state = 150
            self.expresion(0)
            self.state = 151
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 152
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 153
            self.match(LenguajeDominioEspecificoParser.T__3)
            self.state = 157
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                self.state = 154
                self.instruccion()
                self.state = 159
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 160
            self.match(LenguajeDominioEspecificoParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BuclewhileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(LenguajeDominioEspecificoParser.WHILE, 0)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.InstruccionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_buclewhile

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBuclewhile" ):
                listener.enterBuclewhile(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBuclewhile" ):
                listener.exitBuclewhile(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBuclewhile" ):
                return visitor.visitBuclewhile(self)
            else:
                return visitor.visitChildren(self)




    def buclewhile(self):

        localctx = LenguajeDominioEspecificoParser.BuclewhileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_buclewhile)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 162
            self.match(LenguajeDominioEspecificoParser.WHILE)
            self.state = 163
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 164
            self.expresion(0)
            self.state = 165
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 166
            self.match(LenguajeDominioEspecificoParser.T__3)
            self.state = 170
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 49)) & ~0x3f) == 0 and ((1 << (_la - 49)) & 320102847213571) != 0):
                self.state = 167
                self.instruccion()
                self.state = 172
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 173
            self.match(LenguajeDominioEspecificoParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComentarioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMENTARIO(self):
            return self.getToken(LenguajeDominioEspecificoParser.COMENTARIO, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_comentario

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComentario" ):
                listener.enterComentario(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComentario" ):
                listener.exitComentario(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComentario" ):
                return visitor.visitComentario(self)
            else:
                return visitor.visitChildren(self)




    def comentario(self):

        localctx = LenguajeDominioEspecificoParser.ComentarioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_comentario)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 175
            self.match(LenguajeDominioEspecificoParser.COMENTARIO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_asignacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAsignacion" ):
                listener.enterAsignacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAsignacion" ):
                listener.exitAsignacion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAsignacion" ):
                return visitor.visitAsignacion(self)
            else:
                return visitor.visitChildren(self)




    def asignacion(self):

        localctx = LenguajeDominioEspecificoParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_asignacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.match(LenguajeDominioEspecificoParser.ID)
            self.state = 178
            self.match(LenguajeDominioEspecificoParser.T__6)
            self.state = 179
            self.expresion(0)
            self.state = 180
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_expresion

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class ExpresionListaContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def lista(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ListaContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionLista" ):
                listener.enterExpresionLista(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionLista" ):
                listener.exitExpresionLista(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionLista" ):
                return visitor.visitExpresionLista(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionNotContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionNot" ):
                listener.enterExpresionNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionNot" ):
                listener.exitExpresionNot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionNot" ):
                return visitor.visitExpresionNot(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionNumeroContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionNumero" ):
                listener.enterExpresionNumero(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionNumero" ):
                listener.exitExpresionNumero(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionNumero" ):
                return visitor.visitExpresionNumero(self)
            else:
                return visitor.visitChildren(self)


    class OperacionSumaRestaContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperacionSumaResta" ):
                listener.enterOperacionSumaResta(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperacionSumaResta" ):
                listener.exitOperacionSumaResta(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperacionSumaResta" ):
                return visitor.visitOperacionSumaResta(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionStringContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionString" ):
                listener.enterExpresionString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionString" ):
                listener.exitExpresionString(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionString" ):
                return visitor.visitExpresionString(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionCargarMatrizContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionCargarMatriz" ):
                return visitor.visitExpresionCargarMatriz(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionBooleanoContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def TRUE(self):
            return self.getToken(LenguajeDominioEspecificoParser.TRUE, 0)
        def FALSE(self):
            return self.getToken(LenguajeDominioEspecificoParser.FALSE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionBooleano" ):
                listener.enterExpresionBooleano(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionBooleano" ):
                listener.exitExpresionBooleano(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionBooleano" ):
                return visitor.visitExpresionBooleano(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionParentesisContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionParentesis" ):
                listener.enterExpresionParentesis(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionParentesis" ):
                listener.exitExpresionParentesis(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionParentesis" ):
                return visitor.visitExpresionParentesis(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionComparacionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionComparacion" ):
                listener.enterExpresionComparacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionComparacion" ):
                listener.exitExpresionComparacion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionComparacion" ):
                return visitor.visitExpresionComparacion(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionLeerArchivoContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionLeerArchivo" ):
                return visitor.visitExpresionLeerArchivo(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionVariableContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionVariable" ):
                listener.enterExpresionVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionVariable" ):
                listener.exitExpresionVariable(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionVariable" ):
                return visitor.visitExpresionVariable(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionLogicaContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionLogica" ):
                listener.enterExpresionLogica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionLogica" ):
                listener.exitExpresionLogica(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionLogica" ):
                return visitor.visitExpresionLogica(self)
            else:
                return visitor.visitChildren(self)


    class OperacionMatrizExprContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.operacion = None # Token
            self.copyFrom(ctx)

        def MATRIZ(self):
            return self.getToken(LenguajeDominioEspecificoParser.MATRIZ, 0)
        def parametrosMatriz(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosMatrizContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperacionMatrizExpr" ):
                listener.enterOperacionMatrizExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperacionMatrizExpr" ):
                listener.exitOperacionMatrizExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperacionMatrizExpr" ):
                return visitor.visitOperacionMatrizExpr(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionOperacionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def operaciones(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.OperacionesContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionOperacion" ):
                listener.enterExpresionOperacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionOperacion" ):
                listener.exitExpresionOperacion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionOperacion" ):
                return visitor.visitExpresionOperacion(self)
            else:
                return visitor.visitChildren(self)


    class ExpresionMatrizContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def matriz(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.MatrizContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresionMatriz" ):
                listener.enterExpresionMatriz(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresionMatriz" ):
                listener.exitExpresionMatriz(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresionMatriz" ):
                return visitor.visitExpresionMatriz(self)
            else:
                return visitor.visitChildren(self)


    class AccesoCentroidesContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAccesoCentroides" ):
                listener.enterAccesoCentroides(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAccesoCentroides" ):
                listener.exitAccesoCentroides(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAccesoCentroides" ):
                return visitor.visitAccesoCentroides(self)
            else:
                return visitor.visitChildren(self)


    class CrearRegresionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def REGRESION(self):
            return self.getToken(LenguajeDominioEspecificoParser.REGRESION, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCrearRegresion" ):
                listener.enterCrearRegresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCrearRegresion" ):
                listener.exitCrearRegresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrearRegresion" ):
                return visitor.visitCrearRegresion(self)
            else:
                return visitor.visitChildren(self)


    class OperacionMultDivContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperacionMultDiv" ):
                listener.enterOperacionMultDiv(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperacionMultDiv" ):
                listener.exitOperacionMultDiv(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperacionMultDiv" ):
                return visitor.visitOperacionMultDiv(self)
            else:
                return visitor.visitChildren(self)



    def expresion(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = LenguajeDominioEspecificoParser.ExpresionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 14
        self.enterRecursionRule(localctx, 14, self.RULE_expresion, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 220
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                localctx = LenguajeDominioEspecificoParser.ExpresionNotContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 183
                self.match(LenguajeDominioEspecificoParser.T__20)
                self.state = 184
                self.expresion(15)
                pass

            elif la_ == 2:
                localctx = LenguajeDominioEspecificoParser.ExpresionParentesisContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 185
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 186
                self.expresion(0)
                self.state = 187
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass

            elif la_ == 3:
                localctx = LenguajeDominioEspecificoParser.OperacionMatrizExprContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 189
                self.match(LenguajeDominioEspecificoParser.MATRIZ)
                self.state = 190
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 191
                localctx.operacion = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 528482304) != 0)):
                    localctx.operacion = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 192
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 193
                self.parametrosMatriz()
                self.state = 194
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass

            elif la_ == 4:
                localctx = LenguajeDominioEspecificoParser.AccesoCentroidesContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 196
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 197
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 198
                self.match(LenguajeDominioEspecificoParser.T__28)
                pass

            elif la_ == 5:
                localctx = LenguajeDominioEspecificoParser.CrearRegresionContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 199
                self.match(LenguajeDominioEspecificoParser.REGRESION)
                self.state = 200
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 201
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass

            elif la_ == 6:
                localctx = LenguajeDominioEspecificoParser.ExpresionOperacionContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 202
                self.operaciones()
                pass

            elif la_ == 7:
                localctx = LenguajeDominioEspecificoParser.ExpresionMatrizContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 203
                self.matriz()
                pass

            elif la_ == 8:
                localctx = LenguajeDominioEspecificoParser.ExpresionListaContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 204
                self.lista()
                pass

            elif la_ == 9:
                localctx = LenguajeDominioEspecificoParser.ExpresionNumeroContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 205
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass

            elif la_ == 10:
                localctx = LenguajeDominioEspecificoParser.ExpresionVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 206
                self.match(LenguajeDominioEspecificoParser.ID)
                pass

            elif la_ == 11:
                localctx = LenguajeDominioEspecificoParser.ExpresionStringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 207
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass

            elif la_ == 12:
                localctx = LenguajeDominioEspecificoParser.ExpresionBooleanoContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 208
                self.match(LenguajeDominioEspecificoParser.TRUE)
                pass

            elif la_ == 13:
                localctx = LenguajeDominioEspecificoParser.ExpresionBooleanoContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 209
                self.match(LenguajeDominioEspecificoParser.FALSE)
                pass

            elif la_ == 14:
                localctx = LenguajeDominioEspecificoParser.ExpresionLeerArchivoContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 210
                self.match(LenguajeDominioEspecificoParser.T__29)
                self.state = 211
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 212
                self.expresion(0)
                self.state = 213
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass

            elif la_ == 15:
                localctx = LenguajeDominioEspecificoParser.ExpresionCargarMatrizContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 215
                self.match(LenguajeDominioEspecificoParser.T__30)
                self.state = 216
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 217
                self.expresion(0)
                self.state = 218
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 236
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 234
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
                    if la_ == 1:
                        localctx = LenguajeDominioEspecificoParser.OperacionMultDivContext(self, LenguajeDominioEspecificoParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 222
                        if not self.precpred(self._ctx, 19):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 19)")
                        self.state = 223
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1792) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 224
                        self.expresion(20)
                        pass

                    elif la_ == 2:
                        localctx = LenguajeDominioEspecificoParser.ExpresionComparacionContext(self, LenguajeDominioEspecificoParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 225
                        if not self.precpred(self._ctx, 18):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 18)")
                        self.state = 226
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 129024) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 227
                        self.expresion(19)
                        pass

                    elif la_ == 3:
                        localctx = LenguajeDominioEspecificoParser.OperacionSumaRestaContext(self, LenguajeDominioEspecificoParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 228
                        if not self.precpred(self._ctx, 17):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 17)")
                        self.state = 229
                        _la = self._input.LA(1)
                        if not(_la==17 or _la==18):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 230
                        self.expresion(18)
                        pass

                    elif la_ == 4:
                        localctx = LenguajeDominioEspecificoParser.ExpresionLogicaContext(self, LenguajeDominioEspecificoParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 231
                        if not self.precpred(self._ctx, 16):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 16)")
                        self.state = 232
                        _la = self._input.LA(1)
                        if not(_la==19 or _la==20):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 233
                        self.expresion(17)
                        pass

             
                self.state = 238
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class MatrizContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_matriz

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class MatrizMultiFilaContext(MatrizContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.MatrizContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def fila(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.FilaContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.FilaContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMatrizMultiFila" ):
                listener.enterMatrizMultiFila(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMatrizMultiFila" ):
                listener.exitMatrizMultiFila(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMatrizMultiFila" ):
                return visitor.visitMatrizMultiFila(self)
            else:
                return visitor.visitChildren(self)


    class MatrizUnidimensionalContext(MatrizContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.MatrizContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMatrizUnidimensional" ):
                listener.enterMatrizUnidimensional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMatrizUnidimensional" ):
                listener.exitMatrizUnidimensional(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMatrizUnidimensional" ):
                return visitor.visitMatrizUnidimensional(self)
            else:
                return visitor.visitChildren(self)



    def matriz(self):

        localctx = LenguajeDominioEspecificoParser.MatrizContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_matriz)
        self._la = 0 # Token type
        try:
            self.state = 261
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                localctx = LenguajeDominioEspecificoParser.MatrizMultiFilaContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 239
                self.match(LenguajeDominioEspecificoParser.T__31)
                self.state = 240
                self.fila()
                self.state = 245
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 241
                    self.match(LenguajeDominioEspecificoParser.T__5)
                    self.state = 242
                    self.fila()
                    self.state = 247
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 248
                self.match(LenguajeDominioEspecificoParser.T__32)
                pass

            elif la_ == 2:
                localctx = LenguajeDominioEspecificoParser.MatrizUnidimensionalContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 250
                self.match(LenguajeDominioEspecificoParser.T__31)
                self.state = 251
                self.expresion(0)
                self.state = 256
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 252
                    self.match(LenguajeDominioEspecificoParser.T__5)
                    self.state = 253
                    self.expresion(0)
                    self.state = 258
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 259
                self.match(LenguajeDominioEspecificoParser.T__32)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FilaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_fila

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFila" ):
                listener.enterFila(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFila" ):
                listener.exitFila(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFila" ):
                return visitor.visitFila(self)
            else:
                return visitor.visitChildren(self)




    def fila(self):

        localctx = LenguajeDominioEspecificoParser.FilaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_fila)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 263
            self.match(LenguajeDominioEspecificoParser.T__31)
            self.state = 264
            self.expresion(0)
            self.state = 269
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 265
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 266
                self.expresion(0)
                self.state = 271
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 272
            self.match(LenguajeDominioEspecificoParser.T__32)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_lista

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLista" ):
                listener.enterLista(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLista" ):
                listener.exitLista(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLista" ):
                return visitor.visitLista(self)
            else:
                return visitor.visitChildren(self)




    def lista(self):

        localctx = LenguajeDominioEspecificoParser.ListaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_lista)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 274
            self.match(LenguajeDominioEspecificoParser.T__31)
            self.state = 283
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & -2305843001695404028) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & 8078246143) != 0):
                self.state = 275
                self.expresion(0)
                self.state = 280
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 276
                    self.match(LenguajeDominioEspecificoParser.T__5)
                    self.state = 277
                    self.expresion(0)
                    self.state = 282
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 285
            self.match(LenguajeDominioEspecificoParser.T__32)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosMatrizContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosMatriz

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosMatriz" ):
                listener.enterParametrosMatriz(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosMatriz" ):
                listener.exitParametrosMatriz(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosMatriz" ):
                return visitor.visitParametrosMatriz(self)
            else:
                return visitor.visitChildren(self)




    def parametrosMatriz(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosMatrizContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_parametrosMatriz)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 287
            self.expresion(0)
            self.state = 292
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 288
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 289
                self.expresion(0)
                self.state = 294
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RegresionLinealContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_regresionLineal

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class GraficarRegresionContext(RegresionLinealContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.RegresionLinealContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def parametrosPlot(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosPlotContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGraficarRegresion" ):
                listener.enterGraficarRegresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGraficarRegresion" ):
                listener.exitGraficarRegresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGraficarRegresion" ):
                return visitor.visitGraficarRegresion(self)
            else:
                return visitor.visitChildren(self)


    class EntrenarRegresionContext(RegresionLinealContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.RegresionLinealContext
            super().__init__(parser)
            self.x = None # ExpresionContext
            self.y = None # ExpresionContext
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEntrenarRegresion" ):
                listener.enterEntrenarRegresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEntrenarRegresion" ):
                listener.exitEntrenarRegresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEntrenarRegresion" ):
                return visitor.visitEntrenarRegresion(self)
            else:
                return visitor.visitChildren(self)


    class ObtenerMetricaRegresionContext(RegresionLinealContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.RegresionLinealContext
            super().__init__(parser)
            self.target = None # Token
            self.modelo = None # Token
            self.metrica = None # Token
            self.copyFrom(ctx)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(LenguajeDominioEspecificoParser.ID)
            else:
                return self.getToken(LenguajeDominioEspecificoParser.ID, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObtenerMetricaRegresion" ):
                listener.enterObtenerMetricaRegresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObtenerMetricaRegresion" ):
                listener.exitObtenerMetricaRegresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitObtenerMetricaRegresion" ):
                return visitor.visitObtenerMetricaRegresion(self)
            else:
                return visitor.visitChildren(self)



    def regresionLineal(self):

        localctx = LenguajeDominioEspecificoParser.RegresionLinealContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_regresionLineal)
        self._la = 0 # Token type
        try:
            self.state = 322
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                localctx = LenguajeDominioEspecificoParser.EntrenarRegresionContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 295
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 296
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 297
                self.match(LenguajeDominioEspecificoParser.T__33)
                self.state = 298
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 299
                localctx.x = self.expresion(0)
                self.state = 300
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 301
                localctx.y = self.expresion(0)
                self.state = 302
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 303
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 2:
                localctx = LenguajeDominioEspecificoParser.ObtenerMetricaRegresionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 305
                localctx.target = self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 306
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 307
                localctx.modelo = self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 308
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 309
                localctx.metrica = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 515396075520) != 0)):
                    localctx.metrica = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 310
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 311
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 312
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 3:
                localctx = LenguajeDominioEspecificoParser.GraficarRegresionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 313
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 314
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 315
                self.match(LenguajeDominioEspecificoParser.T__38)
                self.state = 316
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 318
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 560750930165760) != 0):
                    self.state = 317
                    self.parametrosPlot()


                self.state = 320
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 321
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrediccionModeloContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_prediccionModelo

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PredecirModeloContext(PrediccionModeloContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.PrediccionModeloContext
            super().__init__(parser)
            self.target = None # Token
            self.modelo = None # Token
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(LenguajeDominioEspecificoParser.ID)
            else:
                return self.getToken(LenguajeDominioEspecificoParser.ID, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPredecirModelo" ):
                listener.enterPredecirModelo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPredecirModelo" ):
                listener.exitPredecirModelo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPredecirModelo" ):
                return visitor.visitPredecirModelo(self)
            else:
                return visitor.visitChildren(self)



    def prediccionModelo(self):

        localctx = LenguajeDominioEspecificoParser.PrediccionModeloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_prediccionModelo)
        try:
            localctx = LenguajeDominioEspecificoParser.PredecirModeloContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 324
            localctx.target = self.match(LenguajeDominioEspecificoParser.ID)
            self.state = 325
            self.match(LenguajeDominioEspecificoParser.T__6)
            self.state = 326
            localctx.modelo = self.match(LenguajeDominioEspecificoParser.ID)
            self.state = 327
            self.match(LenguajeDominioEspecificoParser.T__21)
            self.state = 328
            self.match(LenguajeDominioEspecificoParser.T__39)
            self.state = 329
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 330
            self.expresion(0)
            self.state = 331
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 332
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosPlotContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroPlot(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroPlotContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroPlotContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosPlot

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosPlot" ):
                listener.enterParametrosPlot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosPlot" ):
                listener.exitParametrosPlot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosPlot" ):
                return visitor.visitParametrosPlot(self)
            else:
                return visitor.visitChildren(self)




    def parametrosPlot(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosPlotContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_parametrosPlot)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 334
            self.parametroPlot()
            self.state = 339
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 335
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 336
                self.parametroPlot()
                self.state = 341
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroPlotContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def TRUE(self):
            return self.getToken(LenguajeDominioEspecificoParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(LenguajeDominioEspecificoParser.FALSE, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroPlot

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroPlot" ):
                listener.enterParametroPlot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroPlot" ):
                listener.exitParametroPlot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroPlot" ):
                return visitor.visitParametroPlot(self)
            else:
                return visitor.visitChildren(self)




    def parametroPlot(self):

        localctx = LenguajeDominioEspecificoParser.ParametroPlotContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_parametroPlot)
        self._la = 0 # Token type
        try:
            self.state = 366
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [41]:
                self.enterOuterAlt(localctx, 1)
                self.state = 342
                self.match(LenguajeDominioEspecificoParser.T__40)
                self.state = 343
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 344
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [42]:
                self.enterOuterAlt(localctx, 2)
                self.state = 345
                self.match(LenguajeDominioEspecificoParser.T__41)
                self.state = 346
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 347
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [43]:
                self.enterOuterAlt(localctx, 3)
                self.state = 348
                self.match(LenguajeDominioEspecificoParser.T__42)
                self.state = 349
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 350
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [44]:
                self.enterOuterAlt(localctx, 4)
                self.state = 351
                self.match(LenguajeDominioEspecificoParser.T__43)
                self.state = 352
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 353
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            elif token in [45]:
                self.enterOuterAlt(localctx, 5)
                self.state = 354
                self.match(LenguajeDominioEspecificoParser.T__44)
                self.state = 355
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 356
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            elif token in [46]:
                self.enterOuterAlt(localctx, 6)
                self.state = 357
                self.match(LenguajeDominioEspecificoParser.T__45)
                self.state = 358
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 359
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            elif token in [47]:
                self.enterOuterAlt(localctx, 7)
                self.state = 360
                self.match(LenguajeDominioEspecificoParser.T__46)
                self.state = 361
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 362
                _la = self._input.LA(1)
                if not(_la==87 or _la==88):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 8)
                self.state = 363
                self.match(LenguajeDominioEspecificoParser.T__47)
                self.state = 364
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 365
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EscribirArchivoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.nombre = None # ExpresionContext
            self.contenido = None # ExpresionContext

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_escribirArchivo

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEscribirArchivo" ):
                return visitor.visitEscribirArchivo(self)
            else:
                return visitor.visitChildren(self)




    def escribirArchivo(self):

        localctx = LenguajeDominioEspecificoParser.EscribirArchivoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_escribirArchivo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 368
            self.match(LenguajeDominioEspecificoParser.T__48)
            self.state = 369
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 370
            localctx.nombre = self.expresion(0)
            self.state = 371
            self.match(LenguajeDominioEspecificoParser.T__5)
            self.state = 372
            localctx.contenido = self.expresion(0)
            self.state = 373
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 374
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GuardarMatrizContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.nombre = None # ExpresionContext
            self.matriz_expr = None # ExpresionContext

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_guardarMatriz

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGuardarMatriz" ):
                return visitor.visitGuardarMatriz(self)
            else:
                return visitor.visitChildren(self)




    def guardarMatriz(self):

        localctx = LenguajeDominioEspecificoParser.GuardarMatrizContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_guardarMatriz)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 376
            self.match(LenguajeDominioEspecificoParser.T__49)
            self.state = 377
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 378
            localctx.nombre = self.expresion(0)
            self.state = 379
            self.match(LenguajeDominioEspecificoParser.T__5)
            self.state = 380
            localctx.matriz_expr = self.expresion(0)
            self.state = 381
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 382
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PerceptronMulticapaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_perceptronMulticapa

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class CrearMLPContext(PerceptronMulticapaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.PerceptronMulticapaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def PERCEPTRON(self):
            return self.getToken(LenguajeDominioEspecificoParser.PERCEPTRON, 0)
        def parametrosMLP(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosMLPContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCrearMLP" ):
                listener.enterCrearMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCrearMLP" ):
                listener.exitCrearMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrearMLP" ):
                return visitor.visitCrearMLP(self)
            else:
                return visitor.visitChildren(self)


    class EntrenarMLPContext(PerceptronMulticapaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.PerceptronMulticapaContext
            super().__init__(parser)
            self.x = None # ExpresionContext
            self.y = None # ExpresionContext
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)

        def parametrosEntrenamiento(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosEntrenamientoContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEntrenarMLP" ):
                listener.enterEntrenarMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEntrenarMLP" ):
                listener.exitEntrenarMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEntrenarMLP" ):
                return visitor.visitEntrenarMLP(self)
            else:
                return visitor.visitChildren(self)


    class GraficarPerdidaMLPContext(PerceptronMulticapaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.PerceptronMulticapaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGraficarPerdidaMLP" ):
                listener.enterGraficarPerdidaMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGraficarPerdidaMLP" ):
                listener.exitGraficarPerdidaMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGraficarPerdidaMLP" ):
                return visitor.visitGraficarPerdidaMLP(self)
            else:
                return visitor.visitChildren(self)


    class EvaluarMLPContext(PerceptronMulticapaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.PerceptronMulticapaContext
            super().__init__(parser)
            self.target = None # Token
            self.modelo = None # Token
            self.x = None # ExpresionContext
            self.y = None # ExpresionContext
            self.copyFrom(ctx)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(LenguajeDominioEspecificoParser.ID)
            else:
                return self.getToken(LenguajeDominioEspecificoParser.ID, i)
        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEvaluarMLP" ):
                listener.enterEvaluarMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEvaluarMLP" ):
                listener.exitEvaluarMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEvaluarMLP" ):
                return visitor.visitEvaluarMLP(self)
            else:
                return visitor.visitChildren(self)



    def perceptronMulticapa(self):

        localctx = LenguajeDominioEspecificoParser.PerceptronMulticapaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_perceptronMulticapa)
        self._la = 0 # Token type
        try:
            self.state = 427
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
            if la_ == 1:
                localctx = LenguajeDominioEspecificoParser.CrearMLPContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 384
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 385
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 386
                self.match(LenguajeDominioEspecificoParser.PERCEPTRON)
                self.state = 387
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 388
                self.parametrosMLP()
                self.state = 389
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 390
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 2:
                localctx = LenguajeDominioEspecificoParser.EntrenarMLPContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 392
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 393
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 394
                self.match(LenguajeDominioEspecificoParser.T__33)
                self.state = 395
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 396
                localctx.x = self.expresion(0)
                self.state = 397
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 398
                localctx.y = self.expresion(0)
                self.state = 401
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==6:
                    self.state = 399
                    self.match(LenguajeDominioEspecificoParser.T__5)
                    self.state = 400
                    self.parametrosEntrenamiento()


                self.state = 403
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 404
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 3:
                localctx = LenguajeDominioEspecificoParser.EvaluarMLPContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 406
                localctx.target = self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 407
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 408
                localctx.modelo = self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 409
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 410
                self.match(LenguajeDominioEspecificoParser.T__50)
                self.state = 411
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 412
                localctx.x = self.expresion(0)
                self.state = 413
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 414
                localctx.y = self.expresion(0)
                self.state = 415
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 416
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 4:
                localctx = LenguajeDominioEspecificoParser.GraficarPerdidaMLPContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 418
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 419
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 420
                self.match(LenguajeDominioEspecificoParser.T__51)
                self.state = 421
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 423
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==96:
                    self.state = 422
                    self.match(LenguajeDominioEspecificoParser.STRING)


                self.state = 425
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 426
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosMLPContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroMLP(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroMLPContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroMLPContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosMLP

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosMLP" ):
                listener.enterParametrosMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosMLP" ):
                listener.exitParametrosMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosMLP" ):
                return visitor.visitParametrosMLP(self)
            else:
                return visitor.visitChildren(self)




    def parametrosMLP(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosMLPContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_parametrosMLP)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 429
            self.parametroMLP()
            self.state = 434
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 430
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 431
                self.parametroMLP()
                self.state = 436
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroMLPContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lista(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ListaContext,0)


        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroMLP

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroMLP" ):
                listener.enterParametroMLP(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroMLP" ):
                listener.exitParametroMLP(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroMLP" ):
                return visitor.visitParametroMLP(self)
            else:
                return visitor.visitChildren(self)




    def parametroMLP(self):

        localctx = LenguajeDominioEspecificoParser.ParametroMLPContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_parametroMLP)
        try:
            self.state = 446
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [53]:
                self.enterOuterAlt(localctx, 1)
                self.state = 437
                self.match(LenguajeDominioEspecificoParser.T__52)
                self.state = 438
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 439
                self.lista()
                pass
            elif token in [54]:
                self.enterOuterAlt(localctx, 2)
                self.state = 440
                self.match(LenguajeDominioEspecificoParser.T__53)
                self.state = 441
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 442
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [55]:
                self.enterOuterAlt(localctx, 3)
                self.state = 443
                self.match(LenguajeDominioEspecificoParser.T__54)
                self.state = 444
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 445
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosEntrenamientoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroEntrenamiento(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroEntrenamientoContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroEntrenamientoContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosEntrenamiento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosEntrenamiento" ):
                listener.enterParametrosEntrenamiento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosEntrenamiento" ):
                listener.exitParametrosEntrenamiento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosEntrenamiento" ):
                return visitor.visitParametrosEntrenamiento(self)
            else:
                return visitor.visitChildren(self)




    def parametrosEntrenamiento(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosEntrenamientoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_parametrosEntrenamiento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 448
            self.parametroEntrenamiento()
            self.state = 453
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 449
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 450
                self.parametroEntrenamiento()
                self.state = 455
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroEntrenamientoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def TRUE(self):
            return self.getToken(LenguajeDominioEspecificoParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(LenguajeDominioEspecificoParser.FALSE, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroEntrenamiento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroEntrenamiento" ):
                listener.enterParametroEntrenamiento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroEntrenamiento" ):
                listener.exitParametroEntrenamiento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroEntrenamiento" ):
                return visitor.visitParametroEntrenamiento(self)
            else:
                return visitor.visitChildren(self)




    def parametroEntrenamiento(self):

        localctx = LenguajeDominioEspecificoParser.ParametroEntrenamientoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_parametroEntrenamiento)
        self._la = 0 # Token type
        try:
            self.state = 465
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [56]:
                self.enterOuterAlt(localctx, 1)
                self.state = 456
                self.match(LenguajeDominioEspecificoParser.T__55)
                self.state = 457
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 458
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [57]:
                self.enterOuterAlt(localctx, 2)
                self.state = 459
                self.match(LenguajeDominioEspecificoParser.T__56)
                self.state = 460
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 461
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [58]:
                self.enterOuterAlt(localctx, 3)
                self.state = 462
                self.match(LenguajeDominioEspecificoParser.T__57)
                self.state = 463
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 464
                _la = self._input.LA(1)
                if not(_la==87 or _la==88):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class KmeansContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_kmeans

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class CrearKMeansContext(KmeansContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.KmeansContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def KMEANS(self):
            return self.getToken(LenguajeDominioEspecificoParser.KMEANS, 0)
        def parametrosKMeans(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosKMeansContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCrearKMeans" ):
                listener.enterCrearKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCrearKMeans" ):
                listener.exitCrearKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrearKMeans" ):
                return visitor.visitCrearKMeans(self)
            else:
                return visitor.visitChildren(self)


    class EntrenarKMeansContext(KmeansContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.KmeansContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEntrenarKMeans" ):
                listener.enterEntrenarKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEntrenarKMeans" ):
                listener.exitEntrenarKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEntrenarKMeans" ):
                return visitor.visitEntrenarKMeans(self)
            else:
                return visitor.visitChildren(self)


    class GraficarKMeansContext(KmeansContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.KmeansContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(LenguajeDominioEspecificoParser.ID, 0)
        def parametrosGraficarKMeans(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosGraficarKMeansContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGraficarKMeans" ):
                listener.enterGraficarKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGraficarKMeans" ):
                listener.exitGraficarKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGraficarKMeans" ):
                return visitor.visitGraficarKMeans(self)
            else:
                return visitor.visitChildren(self)



    def kmeans(self):

        localctx = LenguajeDominioEspecificoParser.KmeansContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_kmeans)
        self._la = 0 # Token type
        try:
            self.state = 492
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,31,self._ctx)
            if la_ == 1:
                localctx = LenguajeDominioEspecificoParser.CrearKMeansContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 467
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 468
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 469
                self.match(LenguajeDominioEspecificoParser.KMEANS)
                self.state = 470
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 471
                self.parametrosKMeans()
                self.state = 472
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 473
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 2:
                localctx = LenguajeDominioEspecificoParser.EntrenarKMeansContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 475
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 476
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 477
                self.match(LenguajeDominioEspecificoParser.T__33)
                self.state = 478
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 479
                self.expresion(0)
                self.state = 480
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 481
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass

            elif la_ == 3:
                localctx = LenguajeDominioEspecificoParser.GraficarKMeansContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 483
                self.match(LenguajeDominioEspecificoParser.ID)
                self.state = 484
                self.match(LenguajeDominioEspecificoParser.T__21)
                self.state = 485
                self.match(LenguajeDominioEspecificoParser.T__38)
                self.state = 486
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 488
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 288072046477312) != 0):
                    self.state = 487
                    self.parametrosGraficarKMeans()


                self.state = 490
                self.match(LenguajeDominioEspecificoParser.T__2)
                self.state = 491
                self.match(LenguajeDominioEspecificoParser.T__0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosKMeansContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroKMeans(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroKMeansContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroKMeansContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosKMeans

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosKMeans" ):
                listener.enterParametrosKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosKMeans" ):
                listener.exitParametrosKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosKMeans" ):
                return visitor.visitParametrosKMeans(self)
            else:
                return visitor.visitChildren(self)




    def parametrosKMeans(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosKMeansContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_parametrosKMeans)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 494
            self.parametroKMeans()
            self.state = 499
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 495
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 496
                self.parametroKMeans()
                self.state = 501
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroKMeansContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroKMeans

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroKMeans" ):
                listener.enterParametroKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroKMeans" ):
                listener.exitParametroKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroKMeans" ):
                return visitor.visitParametroKMeans(self)
            else:
                return visitor.visitChildren(self)




    def parametroKMeans(self):

        localctx = LenguajeDominioEspecificoParser.ParametroKMeansContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_parametroKMeans)
        try:
            self.state = 511
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [59]:
                self.enterOuterAlt(localctx, 1)
                self.state = 502
                self.match(LenguajeDominioEspecificoParser.T__58)
                self.state = 503
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 504
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [60]:
                self.enterOuterAlt(localctx, 2)
                self.state = 505
                self.match(LenguajeDominioEspecificoParser.T__59)
                self.state = 506
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 507
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [55]:
                self.enterOuterAlt(localctx, 3)
                self.state = 508
                self.match(LenguajeDominioEspecificoParser.T__54)
                self.state = 509
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 510
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosGraficarKMeansContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroGraficarKMeans(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosGraficarKMeans

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosGraficarKMeans" ):
                listener.enterParametrosGraficarKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosGraficarKMeans" ):
                listener.exitParametrosGraficarKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosGraficarKMeans" ):
                return visitor.visitParametrosGraficarKMeans(self)
            else:
                return visitor.visitChildren(self)




    def parametrosGraficarKMeans(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosGraficarKMeansContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_parametrosGraficarKMeans)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 513
            self.parametroGraficarKMeans()
            self.state = 518
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 514
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 515
                self.parametroGraficarKMeans()
                self.state = 520
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroGraficarKMeansContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroGraficarKMeans

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroGraficarKMeans" ):
                listener.enterParametroGraficarKMeans(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroGraficarKMeans" ):
                listener.exitParametroGraficarKMeans(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroGraficarKMeans" ):
                return visitor.visitParametroGraficarKMeans(self)
            else:
                return visitor.visitChildren(self)




    def parametroGraficarKMeans(self):

        localctx = LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_parametroGraficarKMeans)
        try:
            self.state = 530
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [41]:
                self.enterOuterAlt(localctx, 1)
                self.state = 521
                self.match(LenguajeDominioEspecificoParser.T__40)
                self.state = 522
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 523
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [42]:
                self.enterOuterAlt(localctx, 2)
                self.state = 524
                self.match(LenguajeDominioEspecificoParser.T__41)
                self.state = 525
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 526
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 3)
                self.state = 527
                self.match(LenguajeDominioEspecificoParser.T__47)
                self.state = 528
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 529
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GraficarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.x = None # ExpresionContext
            self.y = None # ExpresionContext

        def GRAFICAR(self):
            return self.getToken(LenguajeDominioEspecificoParser.GRAFICAR, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def parametrosGraficar(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosGraficarContext,0)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_graficar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGraficar" ):
                listener.enterGraficar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGraficar" ):
                listener.exitGraficar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGraficar" ):
                return visitor.visitGraficar(self)
            else:
                return visitor.visitChildren(self)




    def graficar(self):

        localctx = LenguajeDominioEspecificoParser.GraficarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_graficar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 532
            self.match(LenguajeDominioEspecificoParser.GRAFICAR)
            self.state = 533
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 534
            localctx.x = self.expresion(0)
            self.state = 535
            self.match(LenguajeDominioEspecificoParser.T__5)
            self.state = 536
            localctx.y = self.expresion(0)
            self.state = 539
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==6:
                self.state = 537
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 538
                self.parametrosGraficar()


            self.state = 541
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 542
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosGraficarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroGraficar(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroGraficarContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroGraficarContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosGraficar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosGraficar" ):
                listener.enterParametrosGraficar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosGraficar" ):
                listener.exitParametrosGraficar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosGraficar" ):
                return visitor.visitParametrosGraficar(self)
            else:
                return visitor.visitChildren(self)




    def parametrosGraficar(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosGraficarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_parametrosGraficar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 544
            self.parametroGraficar()
            self.state = 549
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 545
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 546
                self.parametroGraficar()
                self.state = 551
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroGraficarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroGraficar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroGraficar" ):
                listener.enterParametroGraficar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroGraficar" ):
                listener.exitParametroGraficar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroGraficar" ):
                return visitor.visitParametroGraficar(self)
            else:
                return visitor.visitChildren(self)




    def parametroGraficar(self):

        localctx = LenguajeDominioEspecificoParser.ParametroGraficarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_parametroGraficar)
        try:
            self.state = 564
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [41]:
                self.enterOuterAlt(localctx, 1)
                self.state = 552
                self.match(LenguajeDominioEspecificoParser.T__40)
                self.state = 553
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 554
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [42]:
                self.enterOuterAlt(localctx, 2)
                self.state = 555
                self.match(LenguajeDominioEspecificoParser.T__41)
                self.state = 556
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 557
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [46]:
                self.enterOuterAlt(localctx, 3)
                self.state = 558
                self.match(LenguajeDominioEspecificoParser.T__45)
                self.state = 559
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 560
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 4)
                self.state = 561
                self.match(LenguajeDominioEspecificoParser.T__47)
                self.state = 562
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 563
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(LenguajeDominioEspecificoParser.PRINT, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_impresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImpresion" ):
                listener.enterImpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImpresion" ):
                listener.exitImpresion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImpresion" ):
                return visitor.visitImpresion(self)
            else:
                return visitor.visitChildren(self)




    def impresion(self):

        localctx = LenguajeDominioEspecificoParser.ImpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_impresion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 566
            self.match(LenguajeDominioEspecificoParser.PRINT)
            self.state = 567
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 568
            self.expresion(0)
            self.state = 573
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 569
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 570
                self.expresion(0)
                self.state = 575
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 576
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 577
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperacionesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)


        def parametrosOp(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosOpContext,0)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_operaciones

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperaciones" ):
                listener.enterOperaciones(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperaciones" ):
                listener.exitOperaciones(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperaciones" ):
                return visitor.visitOperaciones(self)
            else:
                return visitor.visitChildren(self)




    def operaciones(self):

        localctx = LenguajeDominioEspecificoParser.OperacionesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_operaciones)
        try:
            self.state = 634
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [61]:
                self.enterOuterAlt(localctx, 1)
                self.state = 579
                self.match(LenguajeDominioEspecificoParser.T__60)
                self.state = 580
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 581
                self.expresion(0)
                self.state = 582
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [62]:
                self.enterOuterAlt(localctx, 2)
                self.state = 584
                self.match(LenguajeDominioEspecificoParser.T__61)
                self.state = 585
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 586
                self.expresion(0)
                self.state = 587
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [63]:
                self.enterOuterAlt(localctx, 3)
                self.state = 589
                self.match(LenguajeDominioEspecificoParser.T__62)
                self.state = 590
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 591
                self.expresion(0)
                self.state = 592
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [64]:
                self.enterOuterAlt(localctx, 4)
                self.state = 594
                self.match(LenguajeDominioEspecificoParser.T__63)
                self.state = 595
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 596
                self.expresion(0)
                self.state = 597
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [65]:
                self.enterOuterAlt(localctx, 5)
                self.state = 599
                self.match(LenguajeDominioEspecificoParser.T__64)
                self.state = 600
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 601
                self.expresion(0)
                self.state = 602
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [66]:
                self.enterOuterAlt(localctx, 6)
                self.state = 604
                self.match(LenguajeDominioEspecificoParser.T__65)
                self.state = 605
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 606
                self.parametrosOp()
                self.state = 607
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [67]:
                self.enterOuterAlt(localctx, 7)
                self.state = 609
                self.match(LenguajeDominioEspecificoParser.T__66)
                self.state = 610
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 611
                self.expresion(0)
                self.state = 612
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [68]:
                self.enterOuterAlt(localctx, 8)
                self.state = 614
                self.match(LenguajeDominioEspecificoParser.T__67)
                self.state = 615
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 616
                self.expresion(0)
                self.state = 617
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [69]:
                self.enterOuterAlt(localctx, 9)
                self.state = 619
                self.match(LenguajeDominioEspecificoParser.T__68)
                self.state = 620
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 621
                self.expresion(0)
                self.state = 622
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [70]:
                self.enterOuterAlt(localctx, 10)
                self.state = 624
                self.match(LenguajeDominioEspecificoParser.T__69)
                self.state = 625
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 626
                self.parametrosOp()
                self.state = 627
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            elif token in [71]:
                self.enterOuterAlt(localctx, 11)
                self.state = 629
                self.match(LenguajeDominioEspecificoParser.T__70)
                self.state = 630
                self.match(LenguajeDominioEspecificoParser.T__1)
                self.state = 631
                self.parametrosOp()
                self.state = 632
                self.match(LenguajeDominioEspecificoParser.T__2)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosOpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosOp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosOp" ):
                listener.enterParametrosOp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosOp" ):
                listener.exitParametrosOp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosOp" ):
                return visitor.visitParametrosOp(self)
            else:
                return visitor.visitChildren(self)




    def parametrosOp(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosOpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_parametrosOp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 636
            self.expresion(0)
            self.state = 637
            self.match(LenguajeDominioEspecificoParser.T__5)
            self.state = 638
            self.expresion(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MostrarTablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_mostrarTabla

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class MostrarTablaASCIIContext(MostrarTablaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a LenguajeDominioEspecificoParser.MostrarTablaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def MOSTRAR_TABLA(self):
            return self.getToken(LenguajeDominioEspecificoParser.MOSTRAR_TABLA, 0)
        def expresion(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ExpresionContext,0)

        def parametrosTabla(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametrosTablaContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMostrarTablaASCII" ):
                listener.enterMostrarTablaASCII(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMostrarTablaASCII" ):
                listener.exitMostrarTablaASCII(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMostrarTablaASCII" ):
                return visitor.visitMostrarTablaASCII(self)
            else:
                return visitor.visitChildren(self)



    def mostrarTabla(self):

        localctx = LenguajeDominioEspecificoParser.MostrarTablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_mostrarTabla)
        self._la = 0 # Token type
        try:
            localctx = LenguajeDominioEspecificoParser.MostrarTablaASCIIContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 640
            self.match(LenguajeDominioEspecificoParser.MOSTRAR_TABLA)
            self.state = 641
            self.match(LenguajeDominioEspecificoParser.T__1)
            self.state = 642
            self.expresion(0)
            self.state = 645
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==6:
                self.state = 643
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 644
                self.parametrosTabla()


            self.state = 647
            self.match(LenguajeDominioEspecificoParser.T__2)
            self.state = 648
            self.match(LenguajeDominioEspecificoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametrosTablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametroTabla(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LenguajeDominioEspecificoParser.ParametroTablaContext)
            else:
                return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ParametroTablaContext,i)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametrosTabla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametrosTabla" ):
                listener.enterParametrosTabla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametrosTabla" ):
                listener.exitParametrosTabla(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametrosTabla" ):
                return visitor.visitParametrosTabla(self)
            else:
                return visitor.visitChildren(self)




    def parametrosTabla(self):

        localctx = LenguajeDominioEspecificoParser.ParametrosTablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_parametrosTabla)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 650
            self.parametroTabla()
            self.state = 655
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 651
                self.match(LenguajeDominioEspecificoParser.T__5)
                self.state = 652
                self.parametroTabla()
                self.state = 657
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroTablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(LenguajeDominioEspecificoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(LenguajeDominioEspecificoParser.STRING, 0)

        def TRUE(self):
            return self.getToken(LenguajeDominioEspecificoParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(LenguajeDominioEspecificoParser.FALSE, 0)

        def lista(self):
            return self.getTypedRuleContext(LenguajeDominioEspecificoParser.ListaContext,0)


        def getRuleIndex(self):
            return LenguajeDominioEspecificoParser.RULE_parametroTabla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametroTabla" ):
                listener.enterParametroTabla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametroTabla" ):
                listener.exitParametroTabla(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametroTabla" ):
                return visitor.visitParametroTabla(self)
            else:
                return visitor.visitChildren(self)




    def parametroTabla(self):

        localctx = LenguajeDominioEspecificoParser.ParametroTablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_parametroTabla)
        self._la = 0 # Token type
        try:
            self.state = 676
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [72]:
                self.enterOuterAlt(localctx, 1)
                self.state = 658
                self.match(LenguajeDominioEspecificoParser.T__71)
                self.state = 659
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 660
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [73]:
                self.enterOuterAlt(localctx, 2)
                self.state = 661
                self.match(LenguajeDominioEspecificoParser.T__72)
                self.state = 662
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 663
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [74]:
                self.enterOuterAlt(localctx, 3)
                self.state = 664
                self.match(LenguajeDominioEspecificoParser.T__73)
                self.state = 665
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 666
                self.match(LenguajeDominioEspecificoParser.NUMBER)
                pass
            elif token in [75]:
                self.enterOuterAlt(localctx, 4)
                self.state = 667
                self.match(LenguajeDominioEspecificoParser.T__74)
                self.state = 668
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 669
                self.match(LenguajeDominioEspecificoParser.STRING)
                pass
            elif token in [76]:
                self.enterOuterAlt(localctx, 5)
                self.state = 670
                self.match(LenguajeDominioEspecificoParser.T__75)
                self.state = 671
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 672
                _la = self._input.LA(1)
                if not(_la==87 or _la==88):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [77]:
                self.enterOuterAlt(localctx, 6)
                self.state = 673
                self.match(LenguajeDominioEspecificoParser.T__76)
                self.state = 674
                self.match(LenguajeDominioEspecificoParser.T__6)
                self.state = 675
                self.lista()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[7] = self.expresion_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expresion_sempred(self, localctx:ExpresionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 19)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 18)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 17)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 16)
         




