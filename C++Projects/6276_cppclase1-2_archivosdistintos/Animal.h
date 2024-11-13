#include <iostream>
using namespace std;

class Animal{
    public:
        // Constructor
        Animal();
        
        // Métodos propios de la clase Animal
        virtual void expresarse();
        virtual string recorridoEnMetrosPorSegundo();
        virtual void alimentarse(string tipo);
};


