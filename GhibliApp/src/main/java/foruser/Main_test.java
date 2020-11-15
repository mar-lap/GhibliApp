package foruser;

import sources.providers.*;
import forserver.md.*;
import forserver.usecases.*;

import java.util.Scanner;

public class Main_test {

    public static void main(String[] args) {
        System.out.println("What information do you prefer to know? " +
                "\n1.Films" +
                "\n2.People" +
                "\n3.Locations" +
                "\n4.Species" +
                "\n5.Vehicles\n");
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        int q = 0;
        switch (q) {
            case 0: if (type == 1) {
                System.out.println("Enter film id: ");
                new Main_test().testFilmApiProvider();
            }
            else q = 1;
            case 1: if (type == 2) {
                System.out.println("Enter people id: ");
                new Main_test().testPeopleProvider();
            }
            else q = 2;
            case 2: if (type == 3) {
                System.out.println("Enter location id: ");
                new Main_test().testPeopleProvider();
            }
            else q = 3;
            case 3: if (type == 4) {
                System.out.println("Enter species id: ");
                new Main_test().testSpeciesProvider();
            }
            else q = 4;
            case 4: if (type == 5) {
                System.out.println("Enter vehicle id: ");
                new Main_test().testVehiclesProvider();
            }
            else q = 5;
            break;
        }
    }

    private void testFilmApiProvider() {
        GetFilmIdByUseCase useCase = new GetFilmIdByUseCase(new ApiFilmProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Films film = useCase.getFilmsById(id);
        System.out.println(film != null ? film:"Sorry, I didn't find that film\n");
    }

    private void testPeopleProvider(){
        GetPeopleIdByUseCase useCase = new GetPeopleIdByUseCase(new ApiPeopleProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        People people = useCase.getPeopleById(id);
        System.out.println(people != null? people:"Sorry, I didn't find that people\n");
    }

    private void testLocationProvider(){
        GetLocationIdByUseCase useCase = new GetLocationIdByUseCase(new ApiLocationProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Locations location = useCase.getLocationById(id);
        System.out.println(location != null? location:"Sorry, I didn't find that location\n");
    }

    private void testSpeciesProvider(){
        GetSpeciesIdByUseCase useCase = new GetSpeciesIdByUseCase(new ApiSpeciesProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Species species = useCase.getSpeciesById(id);
        System.out.println(species != null? species:"Sorry, I didn't find that species\n");
    }

    private void testVehiclesProvider(){
        GetVehicleIdByUseCase useCase = new GetVehicleIdByUseCase(new ApiVehiclesProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Vehicles vehicle = useCase.getVehicleById(id);
        System.out.println(vehicle != null? vehicle:"Sorry, I didn't find that vehicle\n");
    }
}
