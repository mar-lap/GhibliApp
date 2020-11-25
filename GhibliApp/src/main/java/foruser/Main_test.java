package foruser;

import sources.providers.*;
import forserver.md.*;
import forserver.usecases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_test {
    private ArrayList <Films> AllFilms;

    public static void main(String[] args) {
        System.out.println("What information do you prefer to know? " +
                "\n1.Films" +
                "\n2.People" +
                "\n3.Locations" +
                "\n4.Species" +
                "\n5.Vehicles\n");
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        int q = 1;
        switch (q) {
            case 1: if (type == 1) {
                new Main_test().FilmsApiProvider();
            }
            else q = 2;
            case 2: if (type == 2) {
                new Main_test().PeopleApiProvider();
            }
            else q = 3;
            case 3: if (type == 3) {
                new Main_test().LocationsApiProvider();
            }
            else q = 4;
            case 4: if (type == 4) {
                new Main_test().SpeciesApiProvider();
            }
            else q = 5;
            case 5: if (type == 5) {
                new Main_test().VehiclesApiProvider();
            }
            else q = 6;
            break;
        }
    }

    private void FilmsApiProvider() {
        GetFilm films = new GetFilm(new ApiAllFilmsProvider());
        List <Films> film = films.GetListOfFilms();
        int i = 0;
        for (Films movie:film) {
            System.out.println(film.get(i));
            i++;
        }
        System.out.println(film.size());
    }

    private void PeopleApiProvider() {
        GetPeople people = new GetPeople(new ApiAllPeopleProvider());
        List <People> person = people.GetListOfPeople();
        System.out.println(person != null ? person:"didn't find");
        System.out.println(person.size());
    }

    private void LocationsApiProvider() {
        GetLocation loc = new GetLocation(new ApiAllLocationsProvider());
        List <Locations> locs = loc.GetLIstOfLocations();
        System.out.println(locs != null ? locs:"didn't find");
        System.out.println(locs.size());
    }

    private void SpeciesApiProvider() {
        GetSpecies species = new GetSpecies(new ApiAllSpeciesProvider());
        List <Species> speciess = species.GetListOfSpecies();
        System.out.println(speciess != null ? speciess:"didn't find");
        System.out.println(speciess.size());
    }

    private void VehiclesApiProvider() {
        GetVehicle vehicle = new GetVehicle(new ApiAllVehiclesProvider());
        List <Vehicles> vehicles = vehicle.GetListOfVehicles();
        System.out.println(vehicles != null ? vehicles:"didn't find");
        System.out.println(vehicles.size());
    }
}
