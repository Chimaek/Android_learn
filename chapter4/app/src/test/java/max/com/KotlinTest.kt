package max.com

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun test2() {
        val person = Person("max")
        person.age = 20
        Assert.assertEquals("max", person.name)
        Assert.assertEquals(20, person.age)
    }

    @Test
    fun test3() {
        val person = Person("max")
        person.nickname = "KAN"
        Assert.assertEquals("kan", person.nickname)

    }
}