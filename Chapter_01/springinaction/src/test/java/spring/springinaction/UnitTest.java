package spring.springinaction;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.config.KnightConfig;
import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;
import com.springinaction.quests.Quest;
import com.springinaction.quests.RescueDamselQuest;


public class UnitTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(RescueDamselQuest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
	
	@Test
	public void slayTheDragonUsingXml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/config/KnightConfig.xml");
		Knight knight = context.getBean(BraveKnight.class);
		knight.embarkOnQuest();	//In this case the Quest are injected inside the KnightConfig.xml
		context.close();
	}
	
	@Test
	public void slayTheDragonUsingJava() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(BraveKnight.class);
		knight.embarkOnQuest();	//In this case the Quest are injected inside the KnightConfig.xml
		context.close();
	}
}
