<script setup lang="ts">
const apiUrl = import.meta.env.VITE_API_URL || 'http://localhost:8080/api'
</script>

<template>
  <main class="page">
    <header class="hero">
      <p class="eyebrow">Utsikten Utleie</p>
      <h1>Book your cabin with a view.</h1>
      <p class="subtitle">
        A simple starter for holiday bookings, cabins, and reservation management.
      </p>
      <div class="meta">
        <span>API target</span>
        <code>{{ apiUrl }}</code>
      </div>
    </header>

    <section class="cards">
      <article class="card">
        <h2>Cabin list</h2>
        <p>Browse available cabins and pricing.</p>
      </article>
      <article class="card">
        <h2>Booking flow</h2>
        <p>Collect guest information and reservation details.</p>
      </article>
      <article class="card">
        <h2>Admin tools</h2>
        <p>Manage bookings and host availability later.</p>
      </article>
    </section>
  </main>
</template>
