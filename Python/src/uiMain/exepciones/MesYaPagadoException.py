'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion es para errores cuando se intenta pagar el arriendo de un mismo mes de un inmueble que fue arrendado y ya tenia ese mes pago
'''
from .FunctionalException import FunctionalException

class MesYaPagadoException(FunctionalException):

    def __init__(self, mensaje):
        super().__init__(mensaje)