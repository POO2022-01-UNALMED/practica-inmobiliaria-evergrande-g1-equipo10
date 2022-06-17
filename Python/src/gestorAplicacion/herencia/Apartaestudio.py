from Inmueble import Inmueble


class Apartaestudio(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad, nombreUnidad, torre, numeroApto, numHabitaciones, numBanos):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._nombreUnidad = nombreUnidad
        self._torre = torre
        self._numeroApto = numeroApto
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
    
    
    #Getters and Setters
    def getNombreUnidad(self):
        return self._nombreUnidad
    
    def setNombreUnidad(self,nombre)        :
        self._nombreUnidad = nombre
        
    def getTorre(self):
        return self._torre
    
    def setTorre(self,torre):
        self._torre = torre
        
    def getNumeroApto(self):
        return self._numeroApto
    
    def setNumeroApto(self,apto):
        self._numeroApto = apto
        
    def getNumHabitaciones(self):
        return self._numHabitaciones
    
    def setNumHabitaciones(self, num):
        self._numHabitaciones = num
        
    def getNumBanos(self):
        return self._numBanos
    
    def setNumBanos(self, num):
        self._numBanos = num
        
    