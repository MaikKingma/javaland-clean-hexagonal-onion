package eu.javaland.clean_hexagonal_onion.domaininteraction.author;

import eu.javaland.clean_hexagonal_onion.data.author.AuthorJPA;
import eu.javaland.clean_hexagonal_onion.domain.author.Author;

public class AuthorMapper {
    public static AuthorJPA mapToJPA(Author author){
        return AuthorJPA.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .build();
    }

    public static Author mapToDomain(AuthorJPA authorJPA) {
        return Author.restore()
                .id(authorJPA.getId())
                .firstName(authorJPA.getFirstName())
                .lastName(authorJPA.getLastName())
                .build();
    }
}