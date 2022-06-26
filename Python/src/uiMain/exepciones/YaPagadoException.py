from .FunctionalException import FunctionalException

# error cuando un inmueble se vendio y ya se pago, y se intenta volver a pagar
class YaPagadoException(FunctionalException):
    
    def __init__(self, mensaje):
        super().__init__(mensaje)