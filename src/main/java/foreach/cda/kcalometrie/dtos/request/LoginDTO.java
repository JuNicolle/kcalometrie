package foreach.cda.kcalometrie.dtos.request;

public record LoginDTO(  
    String userName,
    String password,
    String email,
    String role
){
}
