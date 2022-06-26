from .FunctionalException import FunctionalException

# error cuando se intenta pagar el arriendo de un mismo mes de un inmueble que fue arrendado y ya tenia ese mes pago
class MesYaPagadoException(FunctionalException):

    def __init__(self, mensaje):
        super().__init__(mensaje)