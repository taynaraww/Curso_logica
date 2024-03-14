#include <bits/stdc++.h>

using namespace std;

int main()
{
    double base, altura, area, peri, diag;

    cout << "Base do retangulo: ";
    cin >> base;
    cout << "Altura do retangulo: ";
    cin >> altura;

    area = base * altura;
    peri = 2 * base + 2 * altura;
    diag = sqrt(base * base + altura * altura);

    cout << fixed << setprecision(4);
    cout << "AREA = " << area << endl;
    cout << "PERIMETRO = " << peri << endl;
    cout << "DIAGONAL = " << diag << endl;

    return 0;
}
