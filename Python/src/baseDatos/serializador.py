import pickle

class Serializador:

    # path = "Python/src/baseDatos/temp/"   # si se ejecuta desde /practica-inmobiliaria-evergrande-g1-equipo10
    _path = "src/baseDatos/temp/"           # si se ejecuta desde /Python

    @classmethod
    def serializar(cls, objetos: list, nomClase: str):
        picklefile = open(cls._path + f"{nomClase}.pkl", "wb")

        pickle.dump(objetos, picklefile)

        picklefile.close()

    @classmethod
    def deserializar(cls, nomClase):
        picklefile = open(cls._path + f"{nomClase}.pkl", "rb")

        objetos = pickle.load(picklefile)

        picklefile.close()

        return objetos