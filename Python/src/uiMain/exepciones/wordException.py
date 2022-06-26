from .FieldException import FieldException

class wordException(FieldException):

    def __init__(self, mensaje):
        super().__init__(mensaje)