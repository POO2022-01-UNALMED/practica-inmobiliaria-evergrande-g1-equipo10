'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion lanza error cuando se esperaba un valor numerico en un entry
'''

from .FieldException import FieldException

class NumericException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)