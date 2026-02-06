package foreach.cda.kcalometrie.dtos.request;

public record UpdateUserDTO(
    String userName,
    String firstName,
    String role,
    String email,
    String password
) {
}
