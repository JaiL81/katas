package com.kata

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun deleteMiddle(head: ListNode?): ListNode? {
    var listSize = 0
    var currentNode = head
    while (currentNode != null) {
        listSize++
        currentNode = currentNode.next
    }

    if (listSize <= 1) return null

    val middleIndex = listSize / 2
    currentNode = head
    for (i in 1 until middleIndex) {
        currentNode = currentNode?.next
    }

    currentNode?.next = currentNode?.next?.next
    return head
}
