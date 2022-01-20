import csstype.Position
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.await
import kotlinx.coroutines.*
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import kotlin.js.Promise
import react.Props
import react.dom.render
import react.fc
import react.useState
import styled.css
import styled.styledButton
import kotlin.reflect.typeOf

fun main() {
    render(document.getElementById("react-app")!!) {
        child(helloWorld)
        child(requestButton)
    }
}

val helloWorld = fc<Props> {
    var flag by useState(false)
    styledButton {
        css {
            color = if (flag) Color.red else Color.blue
        }
        attrs.onClickFunction = {
            flag = !flag
        }
        +"Hello world"
    }
}

val requestButton = fc<Props> {
    styledButton {
        css {
            color = Color.blue
            position = kotlinx.css.Position.absolute
            left = 110.px
        }
        attrs.onClickFunction = {
//            var ans = "xx"
//            val promise = window.fetch("http://localhost:8080/check")
//                .then { response -> response.text()
//                    .then { text1 -> kotlinx.browser.window.alert(text1.toString())
//                    }
//                }
//            kotlinx.browser.window.alert(ans)
            GlobalScope.launch {
                val response = window.fetch("http://localhost:8080/check")
                val text = response.await().text().await()
                console.log(text)
            }
            console.log("onClick")
        }
        +"Отправить запрос"
    }
}