package group.Java;

import group.Java.repository.UserRepository;
import group.Java.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {
	@Autowired
	private UserRepository repository;

	@Autowired
	private UserService userService;

	@Test
	public void testConnexionBdd() {
		//Given

		//when
		long nbUser = repository.count();
		//Then
		Assert.assertTrue(nbUser > 0);
	}


	@Test
	public void test(){
		User u = repository.findOne(1);
		String r = u.getNomUtilisateur();
		Assert.assertTrue(r.equals("Guenzi"));

		u.getRandonnees().size();
		Assert.assertTrue(u.getRandonnees().size()==1);
	}

	@Test
	public void Liaison()throws Exception {
		userService.lierRandoUtilisateur(5,14);

	}
}


