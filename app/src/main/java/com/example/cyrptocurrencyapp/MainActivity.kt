package com.example.cyrptocurrencyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface

import com.example.cyrptocurrencyapp.presentation.ui.theme.CryptocurrencyAppYTTheme

/** ----- UseCases -----
 * we use useCases in the project between viewModel and repository.
 * We put all logics in to the useCases. This makes our use cases reusable.
 * For example we have getProfileInfo useCase and getProfileInfo logics in it.
 * When we need to use it into different viewModel, it is super easy. Because all
 * the logics in the useCase. However,if the logics in the viewModel we need to write
 * the same logics in to the another viewModel.
 * ---- Package Structure -----
 * There should be 3 different packages in the project.
 * Presentation - UI components ( present something to the user. Composables, XML, viewModels )
 * Domain - Models , Repository Definitions ( Interfaces ), Use Cases ( Business logics )
 * Data - Repository Implementation, API interface, Database etc..
 *
 *  data
 *     remote --> dto - dto means that data which comes directly from the api.
 *     repository --> this is repository implementation
 *  domain
 *     model --> data which we show on the UI
 *     repository --> repository definitions ( Interfaces )
 *     use_cases --> use cases in the app
 *  presentation
 *     ui --> ui components ( composables )
 *     coin_detail and coin_list are the screens (features)
 *
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CryptocurrencyAppYTTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

