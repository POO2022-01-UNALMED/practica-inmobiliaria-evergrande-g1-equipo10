'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion maneja clase de errores asociadas a los entry o cualquier entrada de un formulario del sistema
'''

from .ErrorAplicacion import ErrorAplicacion

class FieldException(ErrorAplicacion):
    def __init__(self, mensaje):
        super().__init__(mensaje)