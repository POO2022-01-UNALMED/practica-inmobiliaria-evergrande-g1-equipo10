from .FieldException import FieldException

# error cuando algun campo esta vacio
class EmptyException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)