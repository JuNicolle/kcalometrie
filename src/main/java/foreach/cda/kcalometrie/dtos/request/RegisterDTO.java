package foreach.cda.kcalometrie.dtos.request;

public record RegisterDTO(
    String userName,
    String firstname,
    String role,
    String email,
    String password
) {  
}
