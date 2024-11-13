#include "Perro.h"

int main()
{
    Perro husky("Husky");
    husky.setEdad(3);
    cout << "Nombre del animal: " << husky.getNombre() << endl;
    cout << "Edad: " << husky.getEdad() << endl;
    husky.alimentarse("hogareño");

    return 0;
}