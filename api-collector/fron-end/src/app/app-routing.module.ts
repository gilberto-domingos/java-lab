
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessedComponent } from './components/accessed/accessed.component';
import { ListAccessedComponent } from './components/list-accessed/list-accessed.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'accessed' },

  { path: 'login', component: LoginComponent },

  { path: 'accessed', component: AccessedComponent },

  { path: 'list-accessed', component: ListAccessedComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
