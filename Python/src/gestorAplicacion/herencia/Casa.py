from herencia.Inmueble import Inmueble

class Casa(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad,numHabitaciones,numBanos, patio, balcon):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
        self._patio = patio
        self._balcon = balcon
    
    #getters and setters 
    def 