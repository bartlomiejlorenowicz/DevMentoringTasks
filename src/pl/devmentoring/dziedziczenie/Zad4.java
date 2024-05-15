package pl.devmentoring.dziedziczenie;

public class Zad4 {
    // Zaprojektuj z użyciem koncepcji dziedziczenia hierarchię klas opisujących pojazdy komunikacji miejskiej.
    //Wyraź w tej hierarchii następujące fakty:
    //
    //1. Wszystkie pojazdy komunikacji miejskiej (k. m.) są pojazdami.
    //2. Komunikacja miejska używa tramwajów i autobusów.
    //3. Pojazdy są garażowane w zajezdniach, odpowiednio tramwajowych i autobusowych.
    //4. Każdy pojazd zna swoją szybkość maksymalną.
    //5. Każdy pojazd k. m. zna swój numer.
    //6. Każdy pojazd k. m. zna swoją zajezdnię.
    //7. Każdy tramwaj jest zestawem 1 do 3 wagonów (i wie, z ilu wagonów się składa).
    //8. Każdy autobus wie, ile zużył paliwa w bieżącym miesiącu.
    //9. Każda zajezdnia wie, jakie pojazdy do niej należą.
    //10. Każda zajezdnia ma nazwę.
    //
    //Każdy pojazd i zajezdnia ma możliwość zwrócenia informacji o sobie:
    //-	dla pojazdu zawiera ona wszystkie informacje, które zna dany pojazd (np. numer, czy szybkość maksymalną).
    //-	Opis zajezdni to nazwa zajezdni, jej typ i opisy poszczególnych pojazdów.
    //-	Zajezdnia autobusowa podaje dodatkowo sumaryczne zużycie paliwa w bieżącym miesiącu, a tramwajowa ogólną liczbę wagonów.

    // Pojazd (Vehicle) - klasa bazowa dla wszystkich pojazdów.
    //Pojazdy komunikacji miejskiej (PublicTransportVehicle) - klasa bazowa dla tramwajów i autobusów, dziedzicząca po klasie Vehicle.
    //Tramwaj (Tram) - klasa reprezentująca tramwaj, dziedzicząca po PublicTransportVehicle.
    //Autobus (Bus) - klasa reprezentująca autobus, dziedzicząca po PublicTransportVehicle.
    //Zajezdnia (Depot) - klasa bazowa dla zajezdni.
    //Zajezdnia tramwajowa (TramDepot) - klasa reprezentująca zajezdnię tramwajową, dziedzicząca po Depot.
    //Zajezdnia autobusowa (BusDepot) - klasa reprezentująca zajezdnię autobusową, dziedzicząca po Depot.
}
