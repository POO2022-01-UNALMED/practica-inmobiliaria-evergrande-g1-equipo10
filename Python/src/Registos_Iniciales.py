
from gestorAplicacion.otros.Pago import Pago
from gestorAplicacion.otros.Cita import Cita
from baseDatos.serializador import Serializador

if __name__ == "__main__":
    pagos = [
        Pago(10,2022,6,1)
    ]

    Serializador.serializar(pagos, "Pago")

    citas = [
        Cita(22, 6, 2022, 4, 1, 1),
        Cita(1, 6, 2022, 4, 1, 1),
    ]

    Serializador.serializar(citas, "Cita")