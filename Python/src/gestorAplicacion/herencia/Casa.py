from Inmueble import Inmueble

class Casa(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad,numHabitaciones,numBanos, patio, balcon):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
        self._patio = patio
        self._balcon = balcon
    
    #toString
    def __str__(self):
        return "| {:<4d} | {:<13s} | {:<14f} | {:<15s} | {:<6f} | {:<11s} | {:<19s} | {:<17s} | {:<20s} | {:<20d} | {:<12d} | {:<8d} | {:<6d} |".format(self.getIdInmueble(),
                                                                                                                                                        type(self).__name__,
                                                                                                                                                        self.getPrecio(), 
                                                                                                                                                        self.getTipoContrato(),
                                                                                                                                                        self.getArea(),
                                                                                                                                                        self.getAmueblado(),
                                                                                                                                                        self.getParqueaderoCarros(),
                                                                                                                                                        self.getParqueaderoMotos(),
                                                                                                                                                        self.getDireccion(),
                                                                                                                                                        self.getNumHabitaciones(),
                                                                                                                                                        self.getNumBanos(),
                                                                                                                                                        self.getPatio(),
                                                                                                                                                        self.getBalcon())
        
        
    #getters and setters 
    def getNumHabitaciones(self):
        return self._numHabitaciones
    
    def setNumHabitaciones(self, num):
        self._numHabitaciones = num
        
    def getNumBanos(self):
        return self._numBanos
    
    def setNumBanos(self, num):
        self._numBanos = num
        
    def getPatio(self):
        return self._patio
    
    def setPatio(self, patio):
        self._patio = patio
        
    def getBalcon(self):
        return self._balcon
    
    def setBalcon(self, balcon):
        self._balcon = balcon