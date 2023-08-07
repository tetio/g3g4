package net.portic.aeat.g4;

import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aduanas.es.aeat.adds.jdit.g4.ws.g4decv1ent.G4DecV1Ent;
import net.portic.aeat.g4.repositories.G4Repository;
import net.portic.aeat.g4.services.G4Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class G3g4ApplicationTests {
	@InjectMocks
	private G4Service g4Service;
	@Mock G4Repository g4Repository;
	@Test
	void contextLoads() {
	}
	@Test
	void shouldReadG4DecV1Ent() throws Exception {
		G4DecV1Ent g4 = g4Service.fromString(new File("src/test/resources/g4_dummy001.xml"));
		assertThat(g4.getMESMessage()).isNotNull();
	}

	@Test
	void shouldTransformG4DecV1EntXmlToJson() throws Exception {
		G4DecV1Ent g4 = g4Service.fromString(new File("src/test/resources/g4_dummy001.xml"));
		String stringified = g4Service.toJsonString(g4);
		assertThat(stringified).isNotEmpty();
	}


	@Test
	void shouldPersistG4() throws Exception {
		G4DecV1Ent g4 = g4Service.fromString(new File("src/test/resources/g4_dummy001.xml"));
		when(g4Repository.save(any(G4DecV1Ent.class))).thenReturn(g4);

		g4.setId("AABBCCDD");
		G4DecV1Ent updatedG4 = g4Service.save(g4);
		//G4DecV1Ent updatedG4 = g4Repository.save(g4);
		assertThat(updatedG4).isNotNull();
	}
}
