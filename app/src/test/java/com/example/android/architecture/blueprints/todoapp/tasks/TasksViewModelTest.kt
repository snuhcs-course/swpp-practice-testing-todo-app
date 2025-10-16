package com.example.android.architecture.blueprints.todoapp.tasks

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.data.DefaultTaskRepository
import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.testing.MainDispatcherRule
import junit.framework.TestCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class TasksViewModel_Simple_Test {
    // TODO
}


//@RunWith(MockitoJUnitRunner::class)
//class TasksViewModel_With_Stub_Test {
////  TODO
//
//}




//@RunWith(MockitoJUnitRunner::class)
//class TasksViewModel_StateFlow_Test {
//
//    @get:Rule
//    val main = MainDispatcherRule(UnconfinedTestDispatcher()) // or StandardTestDispatcher()
//
//    @Mock lateinit var repo: DefaultTaskRepository
//
//    private lateinit var vm: TasksViewModel
//    private lateinit var tasksFlow: MutableStateFlow<List<Task>>
//
//    @Before
//    fun setUp() = kotlinx.coroutines.runBlocking {
//        val t1 = Task(id = "1", title = "A", description = "da", isCompleted = false)
//        val t2 = Task(id = "2", title = "B", description = "db", isCompleted = true)
//        tasksFlow = MutableStateFlow(listOf(t1, t2))
//
//        // state source must be stubbed BEFORE VM creation
//        Mockito.`when`(repo.getTasksStream()).thenReturn(tasksFlow)
//
////        // suspend stubs must return Unit (not null!)
////        Mockito.doAnswer { inv ->
////            val id = inv.arguments[0] as String
////            tasksFlow.value = tasksFlow.value.map { if (it.id == id) it.copy(isCompleted = false) else it }
////            Unit
////        }.`when`(repo).activateTask(Mockito.anyString())
//
//        Mockito.doAnswer {
//            tasksFlow.value = tasksFlow.value.filterNot { it.isCompleted }
//            Unit
//        }.`when`(repo).clearCompletedTasks()
//
//        vm = TasksViewModel(repo, SavedStateHandle())
//    }
//
//    // Test code example
//    @Test
//    fun clearCompletedTasks_removesCompleted_andSnackbar() = runTest {
//        vm.uiState.test {
//            val initial = awaitItem()
//
//            vm.clearCompletedTasks()
//            runCurrent()
//
//            val s1 = awaitItem()
//            TestCase.assertEquals(R.string.completed_tasks_cleared, s1.userMessage)
//
//            val s2 = awaitItem()
//            TestCase.assertTrue(s2.items.none { it.isCompleted })
//
//            cancelAndIgnoreRemainingEvents()
//        }
//    }
//
//    @Test
//    fun completeTask_true_callsRepo_andUpdatesState() = runTest {
//        val task = Task(id = "2", title = "B", description = "db", isCompleted = false)
//        vm.completeTask(task, completed = true).join()
//
//        verify(repo).completeTask("2")
//    }
//
////    @Test
////    fun completeTask_false_updatesSnackbar_andList() = runTest {
////        // TODO
////    }
//
//}

// TODO - final
//@RunWith(MockitoJUnitRunner::class)
//class TasksViewModel_Final_Test {
//
//}