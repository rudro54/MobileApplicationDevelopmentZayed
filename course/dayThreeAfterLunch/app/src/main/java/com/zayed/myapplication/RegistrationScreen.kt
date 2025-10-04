package com.zayed.myapplication

import android.R.attr.duration
import android.R.attr.text
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {

    Scaffold { innerPadding->

        Column(
            modifier= Modifier.padding(innerPadding)
                .fillMaxWidth()

        ) {
            val context = LocalContext.current
            var username by remember { mutableStateOf("") }
            var usernameError by remember { mutableStateOf(false) }
            TextField(
                value = username,
                onValueChange = { data->
                    username = data

                },
                label ={ Text(text ="Username")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                modifier= Modifier.fillMaxWidth()
                    .padding(10.dp,10.dp),
                supportingText = {
                    if(usernameError){
                        Text(text="User Name Is Required !!!")
                    }
                },
                isError = usernameError ,// true or false
                trailingIcon = {
                    if(usernameError){
                        Text("Error", color = MaterialTheme.colorScheme.error)
                    }
                }
            )

            var password by remember { mutableStateOf("") }
           OutlinedTextField(
                value = password,
                onValueChange = {
                    password=it
                },
                label={Text(text="Password")} ,// hint /placeholder
                modifier= Modifier.fillMaxWidth()
                    .padding(10.dp, 10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
               visualTransformation = PasswordVisualTransformation()


            )
            var phoneNumber by remember { mutableStateOf("") }

            OutlinedTextField(
                value = phoneNumber,
                onValueChange = {
                    phoneNumber = it
                },
                label = {Text(text="Phone Number")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp,10.dp)


            )
            val genders = listOf("Male", "Female")
            var selectedGender by remember { mutableStateOf(genders[0]) }
            genders.forEach { gender->
                RadioButton(
                    selected = selectedGender ==gender,
                    onClick = {
                        selectedGender=gender
                    }
                )
                Text(text=gender)
            }
            Row() {
                Button(
                    onClick = {
                        //clear all fields
                        username=""
                        password=""
                        phoneNumber=""
                        selectedGender = genders[0]
                    }
                ) {
                    Text(text="Clear")
                }
                Button(
                    onClick = {}
                ) {
                    Text(text="Forgot Password")
                }
                Button(
                    onClick = {

                        if(username.isEmpty()){
                            usernameError=true
                        }else{
                            usernameError=false
                        }
                        // create a toast
                        val toast = Toast.makeText(
                            context,
                            "Registration Successful for $username",
                            Toast.LENGTH_SHORT//LENGTH_LONG

                        )
                        //show the toast
                        toast.show()

                    },
                ) {
                    Text(text="Register")
                }

            }

        }

    }

}

@Preview(
    showSystemUi = true
)


@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()

}