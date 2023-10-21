import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms'; 
import { ReactiveFormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from './shared/material/material.module';
import { AppComponent } from './app.component';
import { AccessedComponent } from './components/accessed/accessed.component';
import { HttpClientModule } from '@angular/common/http';
import { MenuComponent } from './components/menu/menu.component';
import { CommonService } from './services/common.service';
import { DataAccessedService } from './services/data-accessed.service';
import { ListAccessedComponent } from './components/list-accessed/list-accessed.component';
import { LoginComponent } from './components/login/login.component';
import { AuthService } from './services/auth.service';
import { RegisterComponent } from './components/register/register.component';
import { RegisterService } from './services/register.service';
import { ToolbarComponent } from './components/toolbar/toolbar.component';




@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    AccessedComponent,
    ListAccessedComponent,
    LoginComponent,
    RegisterComponent,
    ToolbarComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule

  ],
  providers: [CommonService, DataAccessedService, AuthService, RegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
