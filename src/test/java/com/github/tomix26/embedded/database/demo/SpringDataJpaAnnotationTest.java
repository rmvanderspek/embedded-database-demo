package com.github.tomix26.embedded.database.demo;

import com.github.tomix26.embedded.database.demo.domain.Person;
import com.github.tomix26.embedded.database.demo.domain.PersonRepository;
import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureEmbeddedDatabase
public class SpringDataJpaAnnotationTest {

	@Autowired
	private PersonRepository personRepository;

	@Test
	public void testEmbeddedDatabase() {
		Optional<Person> personOptional = personRepository.findById(UUID.fromString("b5e9fd10-d046-40ee-89e9-15c42f66ed70"));

		assertThat(personOptional).hasValueSatisfying(person -> {
			assertThat(person.getId()).isNotNull();
			assertThat(person.getFirstName()).isEqualTo("Dave");
			assertThat(person.getLastName()).isEqualTo("Syer");
		});
	}
}
