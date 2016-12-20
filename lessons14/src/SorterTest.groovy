import static org.junit.Assert.assertArrayEquals
import static org.junit.Assert.assertEquals

/**
 * Created by bereznoy on 20.12.2016.
 */
class SorterTest extends spock.lang.Specification {
    def "BubbleSort1"() {
        int[] expected =[]
        int[] actual =[]

        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort2"() {
        int[] expected =[1]
        int[] actual =[1]
        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)


    }
    def "BubbleSort3"() {
        int[] expected =[0,2,4]
        int[] actual = [4,0,2]
        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort4"() {
        int[] expected =[-2,0,4]
        int[] actual =[4,0,-2]

        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)

    }
    def "BubbleSort5"() {
        int[] expected =[0,1,3,5,6,8]
        int[] actual =[8,5,3,6,1,0]
        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)


    }
    def "BubbleSort6"() {
        int[] expected =[0,1,3,5,6,8]
        int[] actual =[0,1,3,5,6,8]
        when:
        Sorter.bubbleSort(actual)
        then:
        assertArrayEquals(expected,actual)



    }

}
