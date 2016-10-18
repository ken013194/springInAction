package spring.springinaction;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.springinaction.knights.BraveKnight;
import com.springinaction.quests.Quest;
import com.springinaction.quests.RescueDamselQuest;


public class UnitTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(RescueDamselQuest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embackOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
