'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion lanza error cuando se esperaban letras en un entry, pero se recibieron numeros
'''

from .FieldException import FieldException

class wordException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)