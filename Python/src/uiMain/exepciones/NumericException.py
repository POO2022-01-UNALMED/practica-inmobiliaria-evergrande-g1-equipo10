from .FieldException import FieldException

# error cuando se esperaba un valor numerico en un entry
class NumericException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)