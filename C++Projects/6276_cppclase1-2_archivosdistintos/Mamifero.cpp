#include "Mamifero.h"

// Constructor de la clase
Mamifero::Mamifero(string nombre){
    this->nombre = nombre;
}

// Getter y Setter
string Mamifero::getNombre(){
    return nombre;
}
void Mamifero::setNombre(string nombre){
    this->nombre = nombre;
}
