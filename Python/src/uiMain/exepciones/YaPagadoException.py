'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion lanza error cuando un inmueble se vendio y ya se pago, y se intenta volver a pagar
'''

from .FunctionalException import FunctionalException

class YaPagadoException(FunctionalException):
    
    def __init__(self, mensaje):
        super().__init__(mensaje)