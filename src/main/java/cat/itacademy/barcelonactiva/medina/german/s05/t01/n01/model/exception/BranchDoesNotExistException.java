package cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.exception;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class BranchDoesNotExistException extends Exception {
    private String message;
}