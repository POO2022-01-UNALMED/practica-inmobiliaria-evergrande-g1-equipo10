'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion lanza un error cuando algun campo esta vacio
'''

from .FieldException import FieldException

class EmptyException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)