'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion lanza error cuando se busca algun objeto en el sistema y este no existe
'''

from .FunctionalException import FunctionalException

class NonExistException(FunctionalException):
    def __init__(self, mensaje):
        super().__init__(mensaje)