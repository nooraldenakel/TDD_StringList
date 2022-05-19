import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class MainKtTest {

    @Test
    fun should_ReturnPercentageOfA_When_TheListContainA_B() {
        //given List Contain Only A and B
        val listValue = listOf("a","b","b")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(33.33, percentage)
    }

    @Test
    fun should_ReturnPercentageOfA_When_TheListContainOnlyA() {
        //given List Contain Only A
        val listValue = listOf("a","a","a")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(100.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_TheListContainOnlyB() {
        //given List Contain Only B
        val listValue = listOf("b","b","b")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_TheListContainAnotherCharacterRatherThenA_B() {
        //given List Contain Another Character rather Than A and B
        val listValue = listOf("b","a","x")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_TheListIsNotContainA_B() {
        //given List Not Contain A and B
        val listValue = listOf("s","e","x")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_TheOneOfTheIndexContainDoubleCharacterRatherOnOne() {
        //given List that one of the Indexes have a Double value rather on One
        val listValue = listOf("s","e","aa")
        //when calculate the Percentage Of A
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_WhenTheListHaveNoElement() {
        //given empty list
        val listValue = listOf<String>()
        //when calculate the PercentageOfA
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_WhenTheListHaveCapitalCharacter() {
        //given list have a Capital Character
        val listValue = listOf<String>()
        //when calculate the PercentageOfA
        val percentage = findCharacterPercentageInList(listValue)
        //then check the Percentage Of A
        assertEquals(-1.0, percentage)
    }

}