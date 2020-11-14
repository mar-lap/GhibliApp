package foruser;

import sources.providers.ApiFilmProvider;
import forserver.md.Films;
import forserver.usecases.GetFilmIdByUseCase;

import java.util.Scanner;

public class Main_test {

    public static void main(String[] args) {
        System.out.println("Enter film id: ");
        new Main_test().testFilmApiProvider();
    }

    private void testFilmApiProvider() {
        GetFilmIdByUseCase useCase = new GetFilmIdByUseCase(new ApiFilmProvider());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Films film = useCase.getFilmsById(id);
        System.out.println(film != null ? film:"Sorry, I didn't found that film\n");
    }
}
