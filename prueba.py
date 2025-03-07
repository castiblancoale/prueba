def generar_progresion_aritmetica(primer_termino, diferencia_comun, cantidad_terminos):
    progresion = []
    for i in range(cantidad_terminos):
        progresion.append(primer_termino + i * diferencia_comun)
    return progresion

primer_termino = 3
diferencia_comun = 2
cantidad_terminos = 10

progresion = generar_progresion_aritmetica(primer_termino, diferencia_comun, cantidad_terminos)
print("Progresión aritmética:", progresion)
