'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion maneja clases de error asociada a errores asociados al negocio que se modela en la aplicacion (ej: un inmueble vendido que ya fue pagado, y se intenta volver a pagarlo)

'''

from .ErrorAplicacion import ErrorAplicacion

class FunctionalException(ErrorAplicacion):

    def __init__(self, mensaje):
        super().__init__(mensaje)