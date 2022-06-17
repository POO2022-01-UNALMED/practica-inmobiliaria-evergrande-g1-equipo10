
class Inmueble():
    _totalImuebles = 0
    _inmuebles = []

    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado,tipoContrato,idUnidad):
        self._precio = precio
        self._direccion = direccion
        self._area = area
        self._numPisos = numPisos
        self._parqueaderoCarros = parqueaderoCarros
        self._parqueaderoMotos = parquederoMotos
        self._amueblado = amueblado
        self._tipoContarto = tipoContrato
        self._idUnidadResidencial = idUnidad

        self._idInmueble = Inmueble._totalImuebles
        Inmueble._totalImuebles += 1

        self._vendido = False
        self._arrendado = False

    @staticmethod
    def agregarInmueble(cls, inmueble):
        cls._totalInmuebles += inmueble
        
    
    #Método pra buscar un grupo de inmuebles por sus id
    @staticmethod
    def buscarInmueblesLista(cls,idImueble):
        listaInmuebles = []
        for id in idImueble:
            for inmueble in cls._inmuebles:
                if inmueble.getIdInmueble() == id:
                    listaInmuebles.append(id)
                
        return listaInmuebles
    
    #Metodo para buscar un inmueble por su id
    @staticmethod
    def buscarInmueble(cls,idInmueble):
        if type(idInmueble).__name__ == 'list':
            return cls.buscarImueblesLista(idInmueble)
        
        for inmueble in cls._inmuebles:
            if inmueble.getIdInmueble() == idInmueble:
                return inmueble
            
            
    #Getters and Setters de atributos de clase
    @staticmethod
    def getTotalInmuebles(cls):
        return cls._totalInmuebles
    
    @staticmethod
    def setTotalInmuebles(cls, total):
        cls._totalImuebles = total
        
    @staticmethod
    def getInmuebles(cls):
        return cls._inmuebles
    
    @staticmethod
    def setInmuebles(cls,inmuebles):
        cls._inmuebles = inmuebles
        
        
    #Getters and Setters de atributos de instancia
    def getIdInmueble(self):
        return self._idInmueble
    
    def setIdInmueble(self,id):
        self._idInmueble = id
        
    def getPrecio(self):
        return self._precio
    
    def setPrecio(self,precio):
        self._precio = precio
        
    def getDireccion(self):
        return self._direccion
    
    def setDireccion(self,direccion):
        self._direccion = direccion
        
    def getArea(self):
        return self._area
    
    def setArea(self,area):
        self._area = area
        
    def getNumPisos(self):
        return self._numPisos
    
    def setNumPisos(self, pisos):
        self._numPisos = pisos
        
    def getParqueaderoCarros(self):
        return self._parqueaderoCarros
    
    def setParqueaderoCarros(self, parqueaderoCarros):
        self._parqueaderoCarros = parqueaderoCarros
        
    def getParqueaderoMotos(self):
            return self._parqueaderoMotos
    
    def setParqueaderoMotos(self, parqueaderoMotos):
        self._parqueaderoMotos = parqueaderoMotos
        
    def getAmueblado(self):
        return self._amueblado
    
    def setAmueblado(self,amueblado):
        self._amueblado = amueblado
        
    def getTipoContrato(self):
        return self._tipoContarto
    
    def setTipoContrato(self,tipo):
        self._tipoContarto = tipo
        
    def getIdUnidadResidencial(self):
        return self._idUnidadResidencial
    
    def setIdUnidadResidencial(self,id):
        self._idUnidadResidencial = id
        
    def getVendido(self):
        return self._vendido
    
    def setVendido(self, isVendido):
        self._vendido = isVendido
    
    def getArrendado(self):
        return self._arrendado
    
    def setArrendado(self, isArrendado):
        self._arrendado = isArrendado   
    
