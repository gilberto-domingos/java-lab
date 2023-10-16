import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessedComponent } from 'src/app/components/accessed/accessed.component';

const routes: Routes = [
  { path: '', component: AccessedComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AccessedsRoutingModule { }
