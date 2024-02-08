package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MiddleNodeTest {
    @Test
    fun `middle node even test`(){
        val list = ListNode(1)
        list.next = ListNode(2)
        list.next?.next = ListNode(3)
        list.next?.next?.next = ListNode(4)

        val deleteMiddle = deleteMiddle(list)
        assertEquals(1, deleteMiddle?.`val`)
        assertEquals(2, deleteMiddle?.next?.`val`)
        assertEquals(4, deleteMiddle?.next?.next?.`val`)
    }

    @Test
    fun `middle node odd test`(){
        val list = ListNode(1)
        list.next = ListNode(2)
        list.next?.next = ListNode(3)

        val deleteMiddle = deleteMiddle(list)
        assertEquals(1, deleteMiddle?.`val`)
        assertEquals(3, deleteMiddle?.next?.`val`)
    }
}