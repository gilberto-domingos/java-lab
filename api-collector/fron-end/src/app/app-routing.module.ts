
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessedComponent } from './components/accessed/accessed.component';
import { ListAccessedComponent } from './components/list-accessed/list-accessed.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'login' },

  { path: 'login', component: LoginComponent },

  { path: 'accessed', component: AccessedComponent },

  { path: 'list-accessed', component: ListAccessedComponent },

  { path: 'register', component: RegisterComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
